package com.example.Spring202208.di_step3;

public class Mssql implements Sql {

	@Override
	public void crud() {
		System.out.println("Mssql.crud");
	}

}
