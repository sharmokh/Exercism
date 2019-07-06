import java.util.*;

class ProteinTranslator {

    public static Map<String, String> map = new HashMap<>();

    public ProteinTranslator() {
        map.put("AUG", "Methionine");
        map.put("UUU", "Phenylalanine");
        map.put("UUC", "Phenylalanine");
        map.put("UUA", "Leucine");
        map.put("UUG", "Leucine");
        map.put("UCU", "Serine");
        map.put("UCC", "Serine");
        map.put("UCA", "Serine");
        map.put("UCG", "Serine");
        map.put("UAU", "Tyrosine");
        map.put("UAC", "Tyrosine");
        map.put("UGU", "Cysteine");
        map.put("UGC", "Cysteine");
        map.put("UGG", "Tryptophan");
        map.put("UAA", "STOP");
        map.put("UAG", "STOP");
        map.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
        Set<String> proteins = new LinkedHashSet<>();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String protein = map.get(rnaSequence.substring(i, i+3));
            if (protein.equals("STOP")) {
                break;
            }
            proteins.add(protein);
        }
        return new ArrayList<String>(proteins);
    }


}