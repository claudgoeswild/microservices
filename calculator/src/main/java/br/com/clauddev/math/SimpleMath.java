package br.com.clauddev.math;

public class SimpleMath {
	
	public Double sum(Double firstNum, Double secNum) {
		return firstNum + secNum;
	}
	
	public Double sub(Double firstNum, Double secNum) {
		return firstNum - secNum;
	}
	
	public Double mult(Double firstNum, Double secNum) {
		return firstNum * secNum;
	}
	
	public Double div(Double firstNum, Double secNum) {
		return firstNum / secNum;
	}
	
	public Double mean(Double firstNum, Double secNum) {
		return (firstNum + secNum)/2;
	}
	
	public Double sqrt(Double firstNum) {
		return (Double) Math.sqrt(firstNum);
	}
}
