package searchengine.secgmaildotcom.util;

import org.tartarus.snowball.ext.EnglishStemmer;

public class StemmerUtil {
    
    private static final EnglishStemmer englishStemmer = new EnglishStemmer();

    public static String[] stem(String request) {
        if (request == null || request.isEmpty()) {
            return new String[0];
        }
        
        String preparingRequestToStemming = request.toLowerCase()
                                        .replaceAll("[^a-z0-9 ]", " ")
                                        .replaceAll("\\s+", " ")
                                        .trim();

        String[] preparedRequestToStem = preparingRequestToStemming.split(" ");
        String[] result = new String[preparedRequestToStem.length];

        synchronized(englishStemmer) {
            for (int i = 0; i < result.length; i++) {
                englishStemmer.setCurrent(preparedRequestToStem[i]);
                englishStemmer.stem();
                result[i] = englishStemmer.getCurrent();
            } 
        }

        return result;
    }

}
