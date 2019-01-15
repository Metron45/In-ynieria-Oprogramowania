
import baza_kaset.Kaseta;

public class Dane {
    public String daneKaset[][]={
        {"Terminator",   "0"},
        {"Matrix",       "1"},
        {"Pi",           "2"},
        {"Shrek",        "3"},
        {"Shrek II",     "4"},
        {"Shrek III",    "5"},
        {"Shrek Forever","6"},
        {"Terminator 2",  "-1"}
    };
    
    public Kaseta daneKasety[]={
        new Kaseta("Terminator",   0),
        new Kaseta("Matrix",       1),
        new Kaseta("Pi",           2),
        new Kaseta("Shrek",        3),
        new Kaseta("Shrek II",     4),
        new Kaseta("Shrek III",    5),
        new Kaseta("Shrek Forever",6),
    };
    
    public int daneIlosci[]={
        2,  3,  4,  5,
        6,  7,  8,  0
    };
    
}
