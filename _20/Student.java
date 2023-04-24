package JavaBasics._20;

public class Student {
    private String name;
    private int age;
    private int qualityRatingOutOf10;
    private String pet;
    private String nameOfSchool;
    private int ageGetterCounter;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty or null");
        } else {
            this.name = name;
        }
    }

        public int getAge () {
            ageGetterCounter++;
            return age;
        }

        public void setAge ( int age){
            if (age < 0) {
                throw new IllegalArgumentException("Age must be always greater than zero");
            } else {
                this.age = age;
            }
        }

            public int getQualityRatingOutOf10 () {
                return qualityRatingOutOf10;
            }

            public void setQualityRatingOutOf10 ( int qualityRatingOutOf10){
                this.qualityRatingOutOf10 = qualityRatingOutOf10;
            }

            public String getPet () {
                return pet;
            }

            public void setPet (String pet){
                this.pet = pet;
            }

            public String getNameOfSchool () {
                return nameOfSchool;
            }

            public void setNameOfSchool (String nameOfSchool){
                this.nameOfSchool = nameOfSchool;
            }

            public int getAgeGetterCounter () {
                return ageGetterCounter;
            }
        }
