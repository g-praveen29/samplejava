class Hello{
public static void main(String[] args){
	String name = System.getenv("USERNAME_VAR");
	if(name != null){
		System.out.println("welcome to Devops Engineer" + " "+ name + "!");
	}
	else{
		System.out.println("Environment variable not set!");
	}
}
}
