import java.io.*;

class checkAnonymous {

int n = 5;

public static void main(String[] args)
{
	checkAnonymous obj = new checkAnonymous();

	System.out.println("Is obj a anonymous class? :" + obj.getClass().isAnonymousClass());

	checkAnonymous object = new checkAnonymous() {
		//
	}; 

	System.out.println(" Is object an anonymous class? :" + object.getClass().isAnonymousClass());
	System.out.println(object.n);
}
}
