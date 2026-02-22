class EXCPDemo2{
	public static void main(String[] args){
		String s = null;
		try{
			System.out.println(s.length());
		}catch(NullPointerException n){
			System.out.println("Null Pointer Exception "+n.getMessage());
		}catch(Exception e){
			System.out.println("Genaral Exception");
		}
	}
}
