package org.example.algorithm.specialClass;

/*Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

        DNA is created by two strands of nucleotides that are bonded together in complementary pairs.
        For each base on one side, there is an opposite base on the other side.
        There are 4 symbols used to represent the bases, A, T, C, and G.
        Symbols A and T are complements of each other, as are C and G.
        */
public class ComplementaryDNA {
  /*  public static String getComplementaryDNA(String dna) {
        StringBuilder complementaryDna = new StringBuilder();

        for (char base : dna.toCharArray()) {
            switch (base) {
                case 'A':
                    complementaryDna.append('T');
                    break;
                case 'T':
                    complementaryDna.append('A');
                    break;
                case 'C':
                    complementaryDna.append('G');
                    break;
                case 'G':
                    complementaryDna.append('C');
                    break;
            }
        }

        return complementaryDna.toString();
    }
    public static void main(String[] args) {
        String dna = "ATCG";

        String complementaryDna = getComplementaryDNA(dna);
        System.out.println("Complementary DNA: " + complementaryDna);
    }*/

      public static String findComplement(String dna) {
          char[] complement = new char[dna.length()];

          for (int i = 0; i < dna.length(); i++) {
              char nucleotide = dna.charAt(i);

              switch (nucleotide) {
                  case 'A':
                      complement[i] = 'T';
                      break;
                  case 'T':
                      complement[i] = 'A';
                      break;
                  case 'C':
                      complement[i] = 'G';
                      break;
                  case 'G':
                      complement[i] = 'C';
                      break;
                  default:
                      complement[i] = nucleotide; // For any other character, keep it as is
              }
          }

          return new String(complement);
      }

      public static void main(String[] args) {
          String dna = "ATCG";
          String complement = findComplement(dna);
          System.out.println("Complementary DNA: " + complement);
      }
  }



