package inheritance;

import java.io.Console;

public class CustomerManager extends PersonManager {
	public void List() {
		System.out.println("Müşteri listelendi");
	}

	public void Add() {
		System.out.println("Eklendi");
	}
}