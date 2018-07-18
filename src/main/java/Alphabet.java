class Alphabet {

    private char letter;
    private int position;
    private AlphabetCase alphabetCase;

    static Alphabet getFirstAlphabet(AlphabetCase alphabetCase) {
        return alphabetCase == AlphabetCase.CAPITAL ? new Alphabet('A') : new Alphabet('a');
    }

    Alphabet(char letter) {
        this.letter = letter;
        setAlphabetCase();
        this.position = this.alphabetCase == AlphabetCase.CAPITAL ? letter - 65 + 1 : letter - 97 + 1;
    }

    Alphabet(int position, AlphabetCase alphabetCase) {
        this.position = position;
        this.alphabetCase = alphabetCase;
        this.letter = this.alphabetCase == AlphabetCase.CAPITAL ?
                (char) (position + 65 - 1) :
                (char) (position + 97 - 1);
    }

    char getLetter() {
        return letter;
    }

    int getPosition() {
        return position;
    }

    private void setAlphabetCase() {
        if (this.letter >= 'A' && letter <= 'Z')
            this.alphabetCase = AlphabetCase.CAPITAL;
        else
            this.alphabetCase = AlphabetCase.SMALL;
    }

    AlphabetCase getAlphabetCase() {
        return alphabetCase;
    }
}
