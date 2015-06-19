public class Directory{


	  public static void main(String[] args) {
		Data Todd = new Data();
		Todd.setFirstName("Todd");
		Todd.setLastName("Lee-Millstein");
		System.out.println(Todd.getFirstName());
		System.out.println(Todd.getLastName());
		/*Compiled is on the line below*/
		System.out.println(Todd.getFirstName()+" "+Todd.getLastName());
		Data Alex = new Data();
		Alex.setFirstName("Alex");
		Alex.setLastName("Mazansky");
		System.out.println(Alex.getFirstName());
		System.out.println(Alex.getLastName());

		Data Tex = new Data();
		Tex.setFirstName("Tex");
		Tex.setLastName("Detroyer");
		System.out.println(Tex.getFirstName());
		System.out.println(Tex.getLastName());

		Data [] Todd_relations = new Data [2];
		Todd_relations [0] = Alex;
		Todd_relations [1] = Tex;
		Todd.setRelations(Todd_relations);


		for(Data data: Todd.getRelations()){
			System.out.println(data.getFirstName());
		}


	}
}