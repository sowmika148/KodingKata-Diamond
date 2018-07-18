class Diamond {

    private Alphabet alphabet;
    private Alphabet firstAlphabet;

    Diamond(char letter) {
        this.alphabet = new Alphabet(letter);
        this.firstAlphabet = Alphabet.getFirstAlphabet(alphabet.getAlphabetCase());
    }

    void draw() {
        drawUpper();
        drawLower();
    }

    private void drawUpper() {
        Alphabet currentAlphabet;
        for (char character = firstAlphabet.getLetter(); character < alphabet.getLetter(); character++) {
            currentAlphabet = new Alphabet(character);
            System.out.print(printCharacter(currentAlphabet.getPosition()));
        }
    }

    String printCharacter(int characterPosition) {
        StringBuilder outStream = new StringBuilder();
        Alphabet currAlphabet = new Alphabet(characterPosition, this.alphabet.getAlphabetCase());
        int letterFirstPosition = alphabet.getPosition() - characterPosition;
        int letterLastPosition = alphabet.getPosition() + characterPosition - 2;
        for (int i = 0; i < 2 * this.alphabet.getPosition() - 1; i++) {
            outStream = i == letterFirstPosition || i == letterLastPosition ?
                    outStream.append(currAlphabet.getLetter()) :
                    outStream.append(" ");
        }
        outStream.append("\n");
        return outStream.toString();
    }

    private void drawLower() {
        Alphabet currentAlphabet;
        for (char character = alphabet.getLetter(); character >= firstAlphabet.getLetter(); character--) {
            currentAlphabet = new Alphabet(character);
            System.out.print(printCharacter(currentAlphabet.getPosition()));
        }
    }
}
