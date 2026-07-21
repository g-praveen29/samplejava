class Hello{
public static void main(String[] args){
	String name = System.getenv("USERNAME_VAR");
	if(name != null){
		System.out.println("Welcome to DevOps Engineer" + " "+ name + "!");
		System.out.println("Have a Nice Day!");
	}
	else{
		System.out.println("Environment variable not set!");
	}
}
}
