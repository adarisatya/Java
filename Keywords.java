package component;

public class Keywords 
	{
		int id = 5;
		public static void staticmethod()
			{
				System.out.println("Initation of Static Method");
			}
		
		void setId()
			{
				int id = 10;
				this.id = id;
			}
		
		static void displayId()
			{
				Keywords key = new Keywords();
				key.setId();
				System.out.println("ID :" + " " + key.id);
			}
		public static void main(String[] args) 
			{
				staticmethod();
				displayId();
			}

}
