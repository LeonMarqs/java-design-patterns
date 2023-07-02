package br.com.designpattern.adapter.enumeration;

import java.util.ArrayList;
import java.util.List;

import br.com.designpattern.adapter.enumeration.adapters.IteratorEnumeration;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		IteratorEnumeration adapter = new IteratorEnumeration(list.iterator());

		while (adapter.hasMoreElements()) {
			System.out.println(adapter.nextElement().toString());
		}
	}

}
