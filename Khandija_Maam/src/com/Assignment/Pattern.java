//*
//**
//***
//****
//*****
//******
//*******
//********
//********
//*******
//******
//*****
//****
//***
//**
//*

package com.Assignment;

public class Pattern {
	public static void main(String[] args) {

		for(int i = 1; i <= 8;i++) {
			for(int j = 1; j <= 8;j++ ) {
				if((i+j)>8) {
					
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 8; i >= 1;i--) {
			for(int j = 8; j >= 1;j-- ) {
				if((i+j)>8) {
					
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
