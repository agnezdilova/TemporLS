package su.nsk.iae.tempor.generator;

import su.nsk.iae.tempor.tempor.AndExpression;
import su.nsk.iae.tempor.tempor.CompExpression;
import su.nsk.iae.tempor.tempor.EquExpression;
import su.nsk.iae.tempor.tempor.Expression;
import su.nsk.iae.tempor.tempor.PrimaryExpression;
import su.nsk.iae.tempor.tempor.SentenceDeclaration;
import su.nsk.iae.tempor.tempor.UnExpression;
import su.nsk.iae.tempor.tempor.XorExpression;


public class ExpressionProcessor {
	
	static String and = "&&";
	static String or = "||";
	static String not = "!";
	static String less = "<";
	static String leq = "<=";
	static String more = ">";
	static String meq = ">=";
	static String xor = "XOR";
	static String eq = "==";
	static String neq = "<>";
	static String fe = "/";
	static String re = "\\";
	static String high = "~";
	static String low = "_";
	static String tau = "TAU";
	
	
	static public String ExprToString(SentenceDeclaration expr) {
		var builder = ExpressionProcessor.toStringDistr(expr.getLogicExpression());
		
		return "("+builder.toString()+")";
	}
	
	private static StringBuilder toStringDistr(Expression expr) {
		if (expr==null) {
			return new StringBuilder();
		} else if (expr instanceof PrimaryExpression) {
			return ExpressionProcessor.toString((PrimaryExpression)expr);
		} else if (expr instanceof UnExpression) {
			return ExpressionProcessor.toString((UnExpression)expr);
		} else if (expr instanceof EquExpression) {
			return ExpressionProcessor.toString((EquExpression)expr);
		} else if (expr instanceof CompExpression) {
			return ExpressionProcessor.toString((CompExpression)expr);
		} else if (expr instanceof AndExpression) {
			return ExpressionProcessor.toString((AndExpression)expr);
		} else if (expr instanceof XorExpression) {
			return ExpressionProcessor.toString((XorExpression)expr);
		} else {
			return ExpressionProcessor.toString(expr);
		}
	}
	
	static StringBuilder toString(PrimaryExpression expr) {
		
		StringBuilder builder = new StringBuilder();
		if (expr.getName()!=null) {
			builder.append(expr.getName().getName());
		} else if (expr.getConstant()!=null){
			builder.append(expr.getConstant());
		} else if (expr.getTau()!=null) {
			builder.append(tau + "(");
			builder.append(expr.getTau().getTime().getInterval());
			builder.append(")");
		} else {
			builder.append(ExpressionProcessor.toStringDistr(expr.getNestExpr()));
		}
		return builder;
	}
	
	static StringBuilder toString(UnExpression expr) {
		
		StringBuilder builder = new StringBuilder();
		if (expr.getRight()!=null) {
			String op ="";
			switch (expr.getUnOp()) {
			case "FE" : op= fe;break;
			case "RE" : op= re;break;
			case "HIGH" : op= high;break;
			case "LOW" : op= low;break;
			case "NOT" : op= not;break;
			case "!" : op= not;break;
			default : op= "";break;
			};
			builder.append(op);
			builder.append("(");
			builder.append(ExpressionProcessor.toString((PrimaryExpression) expr.getRight()));
			builder.append(")");
		}
		return builder;
	}

	static StringBuilder toString(EquExpression expr) {
	
		StringBuilder builder = new StringBuilder();
		builder.append(ExpressionProcessor.toStringDistr(expr.getLeft()));
		if (expr.getRight()!=null) {
			String op="";
			switch (expr.getEquOp()) {
			case EQUAL: op=eq;break;
			case NOT_EQUAL: op=neq;break;
			};
			builder.append(op);
			builder.append(ExpressionProcessor.toStringDistr(expr.getRight()));
		}
		return builder;
	}
	
	static StringBuilder toString(CompExpression expr) {
		
		StringBuilder builder = new StringBuilder();
		builder.append(ExpressionProcessor.toStringDistr(expr.getLeft()));
		if (expr.getRight()!=null) {
			String op="";
			switch (expr.getCompOp()) {
			case LESS: op=less;break;
			case GREATER: op=more;break;
			case GREATER_EQU: op=meq;break;
			case LESS_EQU: op=leq;break;
			};
			builder.append(op);
			builder.append(ExpressionProcessor.toStringDistr(expr.getRight()));
		}
		return builder;
	}
	
	static StringBuilder toString(AndExpression expr) {
		
		StringBuilder builder = new StringBuilder();
		builder.append(ExpressionProcessor.toStringDistr(expr.getLeft()));
		if (expr.getRight()!=null) {
			builder.append(and);
			builder.append(ExpressionProcessor.toStringDistr(expr.getRight()));
		}
		return builder;
	}
	
	static StringBuilder toString(XorExpression expr) {
		
		StringBuilder builder = new StringBuilder();
		builder.append(ExpressionProcessor.toStringDistr(expr.getLeft()));
		if (expr.getRight()!=null) {
			builder.append(xor);
			builder.append(ExpressionProcessor.toStringDistr(expr.getRight()));
		}
		return builder;
	}

	
	static StringBuilder toString(Expression expr) {
		if (expr==null) {
			return new StringBuilder();
		}
		StringBuilder builder = new StringBuilder();
		builder.append(ExpressionProcessor.toStringDistr(expr.getLeft()));
		if (expr.getRight()!=null) {
			builder.append(or);
			builder.append(ExpressionProcessor.toStringDistr(expr.getRight()));
		}
		return builder;
	}
}
