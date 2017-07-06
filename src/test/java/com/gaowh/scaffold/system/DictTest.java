//package com.gaowh.scaffold.system;
//
//import BaseJunit;
//import DictDao;
//import IDictService;
//import org.junit.Assert;
//import org.junit.Test;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.Map;
//
///**
// * 字典服务测试
// *
// * @author gaowh
// * @date 2017-04-27 17:05
// */
//public class DictTest extends BaseJunit {
//
//    @Resource
//    IDictService dictService;
//
//    @Resource
//    DictDao dictDao;
//
//    @Test
//    public void addTest() {
//        String dictName = "这是一个字典测试";
//        String dictValues = "1:测试1;2:测试2";
//        dictService.addDict(dictName, dictValues);
//    }
//
//    @Test
//    public void editTest() {
//        dictService.editDict(16, "测试", "1:测试1;2:测试2");
//    }
//
//    @Test
//    public void deleteTest() {
//        this.dictService.delteDict(16);
//    }
//
//    @Test
//    public void listTest() {
//        List<Map<String, Object>> list = this.dictDao.list("性别");
//        Assert.assertTrue(list.size() > 0);
//    }
//}