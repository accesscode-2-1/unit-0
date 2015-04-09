A concordance lists every word that occurs in the document, and for each word it gives the line number of every line in the document where the word occurs. A concordance is like an index except that line numbers are used instead of page numbers.

Write a program that can create a concordance. The document should be read from an input file.

As you read the file, you want to take each word that you encounter and add it to the concordance along with the current line number.

Because it is so common, don't include the word "the" in your concordance. Also, do not include words that have length less than 3.  Feel free to add other “banned” words for testing purposes.

      public class Concordance {
         private HashSet<String> excludedWords;
         private Map<String, Set<Integer>> listing;

         public Concordance(String filename, Set<String> bannedWords)

         public Set<Integer> findLineNumbers(String word)
         public Set<Integer> getCommonLines(String word1, String word2)
         public void print()
      }

Bonus: output as a json file

         public void printJson()
