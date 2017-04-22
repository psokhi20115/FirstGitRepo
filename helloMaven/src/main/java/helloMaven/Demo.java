package helloMaven;

public class Demo {
	
	public boolean getBoolean(){
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float denomination = 10.005f;
		int NoteValue =  (int) denomination;
		// if NoteValue is 0 take coin value(e.g. 0.01 as 001) from denomination else use NoteValue for Notes
		final String denominationId = "US" + ((NoteValue==0)?((Float.toString(denomination)).replace(".", "")):NoteValue) ;
		System.out.println("denominationId "+denominationId);
		String denominationId1;

	}

}
