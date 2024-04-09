// Judy Elkotory & Mrida Yawale

public class Diabetes implements Comparable{
    //pregnancies, glucose, blood pressure, insulin, BMI, DiabetesPedigreeFunction, age, outcome
    private int pregnancies;
    private int glucose;
    private int bloodPressure;
    private int skinThickness;
    private int insulin;
    private double bmi;
    private double diabetesPedigreeFunction;
    private int age;
    private int outcome;

    //we could find the average age of patients that have diabetes then compare the inputted age to that

    //constructors
    public Diabetes(int p, int g, int bP, int sT, int i, double bmi, double pF, int age, int outcome) {
        pregnancies = p;
        glucose = g;
        bloodPressure = bP;
        skinThickness = sT;
        insulin = i;
        this.bmi = bmi;
        diabetesPedigreeFunction = pF;
        this.age = age;
        this.outcome = outcome;

    }

    public Diabetes(int age, double bmi, int outcome) {
        this.age = age;
        this.bmi = bmi;
        this.outcome = outcome;
    }

    //setters and getters
    public int getPregnancies() {
        return pregnancies;
    }

    public void setPregnancies(int pregnancies) {
        this.pregnancies = pregnancies;
    }

    public int getGlucose() {
        return glucose;
    }

    public void setGlucose(int glucose) {
        this.glucose = glucose;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getSkinThickness() {
        return skinThickness;
    }

    public void setSkinThickness(int skinThickness) {
        this.skinThickness = skinThickness;
    }

    public int getInsulin() {
        return insulin;
    }

    public void setInsulin(int insulin) {
        this.insulin = insulin;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getDiabetesPedigreeFunction() {
        return diabetesPedigreeFunction;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOutcome() {
        return outcome;
    }

    public int compareTo(Diabetes other) {
        int result = this.age.compareTo(other.age);
        //postive
        if(result > 0)
        {

        }
        //negative
        else if (result < 0)
        {

        }
        //zero
        else
        {

        }

        }


        public int bP(int age) {

        }

    }

    //methods
// elements = objects = rows
//variables = collumns

//blood pressure by age
// probability method
    // checks probability

//avg age of patients with diabetes
