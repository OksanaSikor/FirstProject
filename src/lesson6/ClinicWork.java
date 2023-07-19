package lesson6;

public class ClinicWork {

    static Doctor surgeon = new Surgeon();
    static Doctor therapist = new Therapist();
    static Doctor dentist = new Dentist();

    public static void main(String[] args) {

        Pacient pacient = new Pacient();
        TreatmentPlan treatmentPlan = new TreatmentPlan(1);
        pacient.setTreatmentPlan(treatmentPlan);
        pacient.setName("Ivan");
        findDoctor(pacient);

    }

    public static void findDoctor(Pacient pacient){

        if(pacient.getTreatmentPlan() != null){

            switch (pacient.getTreatmentPlan().getCode()){
                case 1:
                   pacient.getTreatmentPlan().setDoctor(surgeon);
                   surgeon.treatment();
                   break;
                case 2:
                    pacient.getTreatmentPlan().setDoctor(dentist);
                    dentist.treatment();
                    break;
                default:
                     pacient.getTreatmentPlan().setDoctor(therapist);
                     therapist.treatment();
                     break;
            }
        }
        else{
            System.out.println("Error, plan not found");
        }
    }
}