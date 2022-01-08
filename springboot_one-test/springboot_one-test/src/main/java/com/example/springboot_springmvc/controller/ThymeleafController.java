package com.example.springboot_springmvc.controller;

import com.example.springboot_springmvc.model.Admin;
import com.example.springboot_springmvc.model.Human;
import com.example.springboot_springmvc.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

//@RestController
@Controller
@RequestMapping(value = "/html")
public class ThymeleafController {
    @RequestMapping(value = "/useradd")
    public String useradd(Model model){
//        model.addAttribute("data","SpringBoot 成功集成 Thymeleaf 模版！");
        model.addAttribute("data","SpringBoot 成功集成 Thymeleaf 模版！");
        return "useradd";
    }
    @RequestMapping(value = "/admin")
    public String admin(Model model){
        Admin admin=new Admin();
        admin.setId(1002);
        admin.setAdminname("xxl");
        model.addAttribute("admin",admin);
        return "admin";

    }
    @RequestMapping(value = "/person")
    public String person(Model model){
        Person person=new Person();
        person.setId(1003);
        person.setName("xxl");
        person.setAge(24);
        model.addAttribute("person",person);
        return "person";
    }
    @RequestMapping(value = "/list")
    public String list(Model model){
        List<Person> personList=new ArrayList<>();
        for (int i=0;i<3;i++){
            Person person=new Person();
            person.setAge(23+i);
            person.setId(1000+i);
            person.setName("xxl"+i);
            personList.add(person);
        }
        model.addAttribute(personList);
        return "list";
    }
    @RequestMapping(value = "/map")
    public String map(Model model){
        Map<Integer,Person> personMap=new HashMap<>();
        for (int i=0;i<4;i++){
            Person person=new Person();
            person.setId(2000+i);
            person.setName("龙哥"+i);
            person.setAge(31+i);
            personMap.put(i,person);
        }
        model.addAttribute("personMap",personMap);
        return "map";
    }
    @RequestMapping(value = "/array")
    public String array(Model model){
        Person[] peopleArray=new Person[3];
        for(int i=0;i<3;i++){
            Person person=new Person();
            person.setId(3000+i);
            person.setAge(40+i);
            person.setName("long"+i);
            peopleArray[i]=person;
        }
        model.addAttribute("peopleArray",peopleArray);
        return "array";
    }
    @RequestMapping(value = "/eachMix")
    public String eachMix(Model model){
        //list -> Map -> List -> User
        List<Map<Integer,List<Person>>> myList = new ArrayList<Map<Integer, List<Person>>>();
        for (int i = 0; i < 2; i++) {
            Map<Integer,List<Person>> myMap = new HashMap<Integer,List<Person>>();
            for (int j = 0; j < 2; j++) {
                List<Person> myPersonList = new ArrayList<Person>();
                for (int k = 0; k < 3; k++) {
                    Person person=new Person();
                    person.setId(3000+k);
                    person.setAge(40+k);
                    person.setName("long"+k);
                    myPersonList.add(person);
                }
                myMap.put(j,myPersonList);
            }
            myList.add(myMap);
        }
        model.addAttribute("myList",myList);
        return "eachMix";
    }
    @RequestMapping(value = "/ifAndSwith")
    public String ifAndSwith(HttpServletRequest request, Model model){
        Human human1=null;
        model.addAttribute("human1",human1);
        Human human2=new Human();
        human2.setId(183119);
        human2.setSex(1);
        human2.setName("肖璇龙");
        model.addAttribute("human2",human2);
        Human human3=new Human();
        human3.setId(183200);
        human3.setName("肖战");
        human3.setSex(0);
        model.addAttribute("human3",human3);
        request.getSession().setAttribute("human3",human3);
        return "ifAndSwith";

    }
    @RequestMapping(value = "/inline")
    public String inline(Model model) {
        model.addAttribute("data","SpringBoot inline");
        return "inline-test";
    }
    @RequestMapping(value = "/literal")
    public String literal(Model model) {

        model.addAttribute("sex",1);
        model.addAttribute("data","SpringBoot Data");
        model.addAttribute("flag",true);
        Person person=new Person();
        person.setId(1001);
        person.setName("lisi");
        model.addAttribute("person",person);

        Person PersonDetail = new Person();
        model.addAttribute("PersonDetail",PersonDetail);
        return "literal";
    }

    @RequestMapping(value = "/splice")
    public String splice(Model model) {
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",13);
        model.addAttribute("currentPage",2);
        model.addAttribute("name","特南克斯");
        model.addAttribute("age",12);
        return "splice";
    }
    @RequestMapping(value = "/operator")
    public String operator(Model model) {
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
        return "operator";
    }
    @RequestMapping(value = "/function")
    public String function(Model model) {
        model.addAttribute("time",new Date());
        model.addAttribute("data","SpringBootHelloWorld");
        return "function";
    }
}
