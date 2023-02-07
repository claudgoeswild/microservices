package br.com.clauddev.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.clauddev.exception.UnsuportedMathOperationException;
import br.com.clauddev.math.SimpleMath;
import br.com.clauddev.request.converters.NumberConverter;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value="/sum/{firstNum}/{secNum}", method = RequestMethod.GET)
	public Double sum (@PathVariable("firstNum") String firstNum, @PathVariable("secNum") String secNum) throws Exception {
		if (!NumberConverter.isNumber(firstNum) || !NumberConverter.isNumber(secNum)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.sum(NumberConverter.convertToDouble(firstNum),NumberConverter.convertToDouble(secNum));
	}
	
	@RequestMapping(value="/sub/{firstNum}/{secNum}", method = RequestMethod.GET)
	public Double sub (@PathVariable("firstNum") String firstNum, @PathVariable("secNum") String secNum) throws Exception {
		if (!NumberConverter.isNumber(firstNum) || !NumberConverter.isNumber(secNum)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.sub(NumberConverter.convertToDouble(firstNum),NumberConverter.convertToDouble(secNum));
	}
	@RequestMapping(value="/div/{firstNum}/{secNum}", method = RequestMethod.GET)
	public Double div (@PathVariable("firstNum") String firstNum, @PathVariable("secNum") String secNum) throws Exception {
		if (!NumberConverter.isNumber(firstNum) || !NumberConverter.isNumber(secNum)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.div(NumberConverter.convertToDouble(firstNum),NumberConverter.convertToDouble(secNum));
	}
	@RequestMapping(value="/mult/{firstNum}/{secNum}", method = RequestMethod.GET)
	public Double mult (@PathVariable("firstNum") String firstNum, @PathVariable("secNum") String secNum) throws Exception {
		if (!NumberConverter.isNumber(firstNum) || !NumberConverter.isNumber(secNum)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.mult(NumberConverter.convertToDouble(firstNum),NumberConverter.convertToDouble(secNum));
	}
	@RequestMapping(value="/mean/{firstNum}/{secNum}", method = RequestMethod.GET)
	public Double mean (@PathVariable("firstNum") String firstNum, @PathVariable("secNum") String secNum) throws Exception {
		if (!NumberConverter.isNumber(firstNum) || !NumberConverter.isNumber(secNum)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.mean(NumberConverter.convertToDouble(firstNum),NumberConverter.convertToDouble(secNum));
	}
	@RequestMapping(value="/sqrt/{firstNum}", method = RequestMethod.GET)
	public Double sqrt (@PathVariable("firstNum") String firstNum) throws Exception {
		if (!NumberConverter.isNumber(firstNum)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.sqrt(NumberConverter.convertToDouble(firstNum));
	}
}
