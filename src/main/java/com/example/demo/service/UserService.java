package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id){
//        Option<User> option = userRepository.findById(id);
        User user = userRepository.findById(id).get();
//        user.setPassword(null);
        return user;
    }

    public void add(User user){userRepository.save(user);}

    public void update(User user){
        userRepository.save(user);
    }

    public void resetPassword(Integer id) {
        User user = userRepository.findById(id).get();
        user.setPassword("123456");
        userRepository.save(user);
    }

    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }

    //动态查询
    public List<User> query(Map<String, Object> jsonData) {
//
//        Specification<User> mpsQuery = new Specification<User>() {
//            @Override
//            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
//                List<Predicate> predicates = new ArrayList<>();
//
//                if (!StringUtils.isEmpty(jsonData.get("province"))) {
//                    predicates.add(criteriaBuilder.equal(root.get("company").get("province"), jsonData.get("province").toString()));
//                }
//                if (!StringUtils.isEmpty(jsonData.get("city"))) {
//                    predicates.add(criteriaBuilder.equal(root.get("company").get("city"), jsonData.get("city").toString()));
//                }
//                if (!StringUtils.isEmpty(jsonData.get("companytypeid"))) {
//                    if (Integer.parseInt(jsonData.get("companytypeid").toString()) == 1 ||Integer.parseInt(jsonData.get("companytypeid").toString()) == 2){
//                        if (!StringUtils.isEmpty(jsonData.get("companyid"))) {
//                            predicates.add(criteriaBuilder.equal(root.get("company").get("id"),jsonData.get("companyid").toString()));
//                        }
//                    }
//                    if (Integer.parseInt(jsonData.get("companytypeid").toString()) == 4){
//                        if (!StringUtils.isEmpty(jsonData.get("companyid"))) {
//                            predicates.add(criteriaBuilder.equal(root.get("company").get("id"),jsonData.get("owncompanyid").toString()));
//                        }
//                    }
//                }
//                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
//            }
//        };
//
//        List<User> mpsPage = userRepository.findAll(mpsQuery);
//        return mpsPage;
        return null;
    }

}
