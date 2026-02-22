class EXCPDemo3{
	public static void main(String[] args){
		int a = 7;
		int b =0;
		int result =0;
		try{
			result=a/b;
		}catch(Exception e){
			System.out.println("ArithmeticException : "+e.getMessage());
		}finally{
			System.out.println("Always Execute");
		}
	}
}
