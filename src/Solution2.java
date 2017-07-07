import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {


	static int gemstones(String[] rocks) {

		Character[] gemstones;

		int gemstonesNumber = 0;




		List<Set<Character>> uniques = new ArrayList<Set<Character>>();

		for (String rock : rocks){

			Set<Character> unique = new HashSet<Character>();

			for( int i = 0; i < rock.length(); i++)

				unique.add(rock.charAt(i) );

			uniques.add(unique);
		}

		if (rocks.length == 1)
			return uniques.get(0).size();


		Set<Character> firstUnique = uniques.get(0);

		List<Set<Character>> otherUniques = uniques.subList(1,uniques.size());


		for (Character test : firstUnique){

			boolean isThere = true;

			for (Set<Character> otherUnique : otherUniques) {

				if (!otherUnique.contains(test)){
					 isThere = false;
				}
			}

			if (isThere)
				gemstonesNumber++;

		}

		return gemstonesNumber;

	}



	public static void main(String[] args) {

		String test = "";

		System.out.println();
	}
}
