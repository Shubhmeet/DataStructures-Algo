
public class ComplexNumberMultipy {

	// mulitply 2 complex number 1+1i * 1+1i =0+2i
	public String complexNumberMultiply(String a1, String b1) {
    String[] s=a1.split("\\+|i");
    String[] t=b1.split("\\+|i");
    int a=Integer.parseInt(s[0]);
    int b=Integer.parseInt(s[1]);
    int x=Integer.parseInt(t[0]);
    int y=Integer.parseInt(t[1]);
    return (a*x-b*y)+"+"+(b*x+a*y)+"i";
}
}
