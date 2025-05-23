package ChainOfResponsability;

interface IBancnote {
    void retrage(int suma) throws Exception;
    void setUrmator(IBancnote urmator);
}