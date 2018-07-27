package kr.co.infopub.chap074;

import java.util.ArrayList;
import java.util.List;

public class TestA implements Cloneable {
	 private String name;
	 //[2]Ãß°¡
	 private ArrayList<String> list = new ArrayList<String>();

	 
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }

	 public Object clone() throws CloneNotSupportedException {
		TestA a = (TestA)super.clone();
		return a;
	 }

	 public List getList() {
		 return list;
	 }

	 public void setList(String value) {
		 this.list.add(value);
	 }


}
