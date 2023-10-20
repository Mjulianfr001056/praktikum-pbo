package meet5.tugas;

import java.util.ArrayList;
import java.util.Date;

public class UniversityTest {
    public static void main(String[] args) {
        //Making list of employees
        //Administrative employees
        ArrayList<Administrative_Employee> daftar_AE = new ArrayList<>();

        daftar_AE.add(new Administrative_Employee(
                "374-61-XXXX", "Muhammad Julian Firdaus", "julian@univ.id", 25));
        daftar_AE.add(new Administrative_Employee(
                        "248-06-XXXX", "Farhan Maulana", "farhan@univ.id", 25));
        daftar_AE.add(new Administrative_Employee(
                "338-68-XXXX", "Sabilla Hamda Syahputri", "sabilla@univ.id",24));
        daftar_AE.add( new Administrative_Employee(
                "406-32-XXXX", "Erika Azizah Khoirunnisa", "erika@univ.id", 21));
        daftar_AE.add( new Administrative_Employee(
                "309-94-XXXX", "Syakira Rizky Andini", "syakira@univ.id",25));

        //Research Associate
        ArrayList<Research_Associate> daftar_RA = new ArrayList<>();

        daftar_RA.add(new Research_Associate(
                "190-36-XXXX", "Adinda Ayu Pramesthi", "adin@univ.id", "Komputer"));
        daftar_RA.add(new Research_Associate(
                "493-23-XXXX", "Seizra Aulia Salsabila", "seizra@univ.id", "Komputer"));
        daftar_RA.add(new Research_Associate(
                "250-73-XXXX", "Falana Rofako Hakam", "falana@univ.id", "Komputer"));
        daftar_RA.add(new Research_Associate(
                "078-52-XXXX", "I Kadek Purna Widyarta", "kadek@univ.id", "Komputer"));
        daftar_RA.add(new Research_Associate(
                "374-64-XXXX", "Ibnu Gata", "ibnu@univ.id", "Komputer"));
        daftar_RA.add(new Research_Associate(
                "589-54-XXXX", "Rifky Maulana Putra", "rifky@univ.id", "Komputer"));

        daftar_RA.add(new Research_Associate(
                "578-50-XXXX", "Angga Prayoga", "angga@univ.id", "Teknik"));
        daftar_RA.add(new Research_Associate(
                "426-61-XXXX", "Calivi Kezia Laksamana Putri", "calivi@univ.id", "Teknik"));
        daftar_RA.add( new Research_Associate(
                "482-68-XXXX", "Dyah Widyastuti", "dyah@univ.id", "Teknik"));
        daftar_RA.add( new Research_Associate(
                "428-54-XXXX", "Pembayun Otsu Indiana", "pembayun@univ.id", "Teknik"));
        daftar_RA.add( new Research_Associate(
                "209-08-XXXX", "Ahmad Nadifa Al Agung", "nadifa@univ.id", "Teknik"));
        daftar_RA.add( new Research_Associate(
                "610-54-XXXX", "Muhammad Alfa Risxi", "alfa@univ.id", "Teknik"));

        daftar_RA.add( new Research_Associate(
                "331-21-XXXX", "Ainul Baharuddin", "ainul@univ.id", "Ekonomi"));
        daftar_RA.add( new Research_Associate(
                "579-96-XXXX", "Fajar Malik Noor Ahmad", "fajar@univ.id", "Ekonomi"));
        daftar_RA.add( new Research_Associate(
                "605-34-XXXX", "Faiz Fathur Rahman", "faiz@univ.id", "Ekonomi"));
        daftar_RA.add( new Research_Associate(
                "031-37-XXXX", "Salma Afna Humaira Hikmatullah", "salma@univ.id", "Ekonomi"));
        daftar_RA.add( new Research_Associate(
                "519-25-XXXX", "Syarifah Annisa Assegaf", "annisa@univ.id", "Ekonomi"));
        daftar_RA.add( new Research_Associate(
                "255-87-XXXX", "Radyah Hemalya", "radyah@univ.id", "Ekonomi"));

        //Making List of Faculty
        ArrayList<Faculty> daftar_fakultas = new ArrayList<>();

        daftar_fakultas.add(new Faculty("Fakultas Informatika dan Komputer"));
        daftar_fakultas.get(0).setDean(daftar_AE.get(0));

        daftar_fakultas.add(new Faculty("Fakultas Teknik"));
        daftar_fakultas.get(1).setDean(daftar_AE.get(1));

        daftar_fakultas.add(new Faculty("Fakultas Ekonomi dan Bisnis"));
        daftar_fakultas.get(2).setDean(daftar_AE.get(2));

        //Adding List of Institute
        Faculty tmp_f = daftar_fakultas.get(0);

        tmp_f.addInstitute("Informatika Terapan", "Jl. Otista I");
        tmp_f.addInstitute("Informasi Manajemen", "Jl. Otista II");
        tmp_f.addInstitute("Teknologi Kuantum", "Jl. Otista III");
        tmp_f.addInstitute("Ilmu Komputer", "Jl. Otista IV");

        tmp_f = daftar_fakultas.get(1);

        tmp_f.addInstitute("Teknik Elektro", "Jl. Sensus I");
        tmp_f.addInstitute("Teknik Informasi", "Jl. Sensus II");
        tmp_f.addInstitute("Teknik Robotika", "Jl. Sensus III");

        tmp_f = daftar_fakultas.get(2);

        tmp_f.addInstitute("Kebendaharaan Negara", "Jl. Mangga I");
        tmp_f.addInstitute("Ekonomi Murni", "Jl. Mangga II");

        //Assigning each research associate
        //Fakultas Informatika dan Komputer
        Institute tmp_i = daftar_fakultas.get(0).findInstitute("Informatika Terapan");

        tmp_i.assign_associate(daftar_RA.get(0));
        tmp_i.assign_associate(daftar_RA.get(2));
        tmp_i.assign_associate(daftar_RA.get(4));

        tmp_i = daftar_fakultas.get(0).findInstitute("Informasi Manajemen");

        tmp_i.assign_associate(daftar_RA.get(0));
        tmp_i.assign_associate(daftar_RA.get(1));
        tmp_i.assign_associate(daftar_RA.get(3));

        tmp_i = daftar_fakultas.get(0).findInstitute("Teknologi Kuantum");

        tmp_i.assign_associate(daftar_RA.get(1));
        tmp_i.assign_associate(daftar_RA.get(2));
        tmp_i.assign_associate(daftar_RA.get(3));
        tmp_i.assign_associate(daftar_RA.get(5));

        tmp_i = daftar_fakultas.get(0).findInstitute("Ilmu Komputer");
        tmp_i.assign_associate(daftar_RA.get(0));
        tmp_i.assign_associate(daftar_RA.get(4));
        tmp_i.assign_associate(daftar_RA.get(5));

        //Fakultas Teknik
        tmp_i = daftar_fakultas.get(1).findInstitute("Teknik Elektro");
        tmp_i.assign_associate(daftar_RA.get(6));
        tmp_i.assign_associate(daftar_RA.get(7));
        tmp_i.assign_associate(daftar_RA.get(8));
        tmp_i.assign_associate(daftar_RA.get(9));

        tmp_i = daftar_fakultas.get(1).findInstitute("Teknik Informasi");
        tmp_i.assign_associate(daftar_RA.get(8));
        tmp_i.assign_associate(daftar_RA.get(11));

        tmp_i = daftar_fakultas.get(1).findInstitute("Teknik Robotika");
        tmp_i.assign_associate(daftar_RA.get(6));
        tmp_i.assign_associate(daftar_RA.get(7));
        tmp_i.assign_associate(daftar_RA.get(10));

        //Fakultas Ekonomi dan Bisnis
        tmp_i = daftar_fakultas.get(2).findInstitute("Kebendaharaan Negara");
        tmp_i.assign_associate(daftar_RA.get(12));
        tmp_i.assign_associate(daftar_RA.get(13));
        tmp_i.assign_associate(daftar_RA.get(14));

        tmp_i = daftar_fakultas.get(2).findInstitute("Ekonomi Murni");
        tmp_i.assign_associate(daftar_RA.get(15));
        tmp_i.assign_associate(daftar_RA.get(16));
        tmp_i.assign_associate(daftar_RA.get(17));

        //Making list of lecturers
        ArrayList<Lecturer> daftar_lecturer = new ArrayList<>();
        daftar_lecturer.add(new Lecturer(
                "xxx", "Muhammad Afnan Alfian", "afnan@univ.id", "Komputer", 8.5));
        daftar_lecturer.add(new Lecturer(
                "xxx", "Sisilia Agustina Manalu", "sisil@univ.id", "Komputer", 5));
        daftar_lecturer.add(new Lecturer(
                "xxx", "Syawalgi Wahyu Imani", "syawal@univ.id", "Teknik", 5));
        daftar_lecturer.add(new Lecturer(
                "xxx", "Nasywa Nur Amalia", "nasywa@univ.id", "Teknik", 7));
        daftar_lecturer.add(new Lecturer(
                "xxx", "Afif Tegar Ardika", "tegar@univ.id", "Ekonomi", 8));
        daftar_lecturer.add(new Lecturer(
                "xxx", "Aida Muthia Suhaib", "Aida@univ.id", "Ekonomi", 10));

        //Making list of courses
        ArrayList<Course> matkul_komputer = new ArrayList<>();

        matkul_komputer.add(new Course("Teori Komputasi", "K001", 2.0f));
        matkul_komputer.add(new Course("Interaksi Manusia dan Komputer", "K002", 2.0f));
        matkul_komputer.add(new Course("Manajemen Proyek", "K003", 4.0f));
        matkul_komputer.add(new Course("Pemograman Berorientasi Objek", "K004", 4.0f));
        matkul_komputer.add(new Course("Soft Computing", "K005", 1.0f));
        matkul_komputer.add(new Course("Aljabar Linear", "K006", 2.5f));

        ArrayList<Course> matkul_teknik = new ArrayList<>();

        matkul_teknik.add(new Course("Pengantar Lingkungan Lahan Basah",  "T001", 2.0f));
        matkul_teknik.add(new Course("Pengantar Ilmu Teknik",  "T002", 1.0f));
        matkul_teknik.add(new Course("Fisika Teknik",  "T003", 3.0f));
        matkul_teknik.add(new Course("Statistika Teknik",  "T004", 3.0f));
        matkul_teknik.add(new Course("Kalkulus Lanjut",  "T005", 2.0f));
        matkul_teknik.add(new Course("Rangkaian Listrik",  "T006", 4.0f));

        ArrayList<Course> matkul_ekonomi = new ArrayList<>();

        matkul_ekonomi.add( new Course("Ekonomi Mikro", "E001", 2.0f));
        matkul_ekonomi.add( new Course("Ekonomi Makro", "E002", 2.0f));
        matkul_ekonomi.add( new Course("Sistem Nasional", "E003", 3.0f));
        matkul_ekonomi.add( new Course("Ekonometrika", "E004", 3.0f));
        matkul_ekonomi.add( new Course("Manajemen Ilmu Bisnis", "E005", 4.0f));
        matkul_ekonomi.add( new Course("Statistika Ekonomi", "E006", 4.0f));


        //Assigning courses to lecturers
        ArrayList<Teaching> daftar_ajar = new ArrayList<>();

        //Matkul Komputer
        daftar_ajar.add(new Teaching(daftar_lecturer.get(0), matkul_komputer.get(0)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(0), matkul_komputer.get(3)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(0), matkul_komputer.get(5)));

        daftar_ajar.add(new Teaching(daftar_lecturer.get(1), matkul_komputer.get(1)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(1), matkul_komputer.get(2)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(1), matkul_komputer.get(4)));

        //Matkul Teknik
        daftar_ajar.add(new Teaching(daftar_lecturer.get(2), matkul_teknik.get(0)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(2), matkul_teknik.get(1)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(2), matkul_teknik.get(2)));

        daftar_ajar.add(new Teaching(daftar_lecturer.get(3), matkul_teknik.get(3)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(3), matkul_teknik.get(4)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(3), matkul_teknik.get(5)));

        //Matkul Ekonomi

        daftar_ajar.add(new Teaching(daftar_lecturer.get(4), matkul_ekonomi.get(0)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(4), matkul_ekonomi.get(1)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(4), matkul_ekonomi.get(4)));

        daftar_ajar.add(new Teaching(daftar_lecturer.get(5), matkul_ekonomi.get(2)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(5), matkul_ekonomi.get(3)));
        daftar_ajar.add(new Teaching(daftar_lecturer.get(5), matkul_ekonomi.get(5)));

        //Set teaching hour every Lecturer
        for(Lecturer l : daftar_lecturer){
            l.setTeachingHour(daftar_ajar);
        }
        //Making list of Projects
        ArrayList<Project> daftar_project = new ArrayList<>();

        daftar_project.add(new Project("Pembangunan Sistem Informasi BPS Kabupaten Tabalong",
                new Date(2023-1900, 2-1, 15), new Date(2023-1900, 7-1, 25)));
        daftar_project.add(new Project("Pengembangan Lahan Gambut",
                new Date(2022-1900, 7-1, 11), new Date(2023-1900, 1-1, 24)));
        daftar_project.add(new Project("Publikasi Tingkat Inflasi Tahunan",
                new Date(2022-1900, 10-1, 1), new Date(2023-1900, 10-1, 4)));

        //Assigning Research Associate to Projects
        ArrayList<Participation> daftar_partisipasi = new ArrayList<>();

        //Partisipasi di project 1
        Project tmp_p = daftar_project.get(0);

        daftar_partisipasi.add(new Participation(8, tmp_p, daftar_RA.get(1)));
        daftar_partisipasi.add(new Participation(4, tmp_p, daftar_RA.get(2)));
        daftar_partisipasi.add(new Participation(3.5, tmp_p, daftar_RA.get(4)));

        //Partisipasi di project 2
        tmp_p = daftar_project.get(1);
        daftar_partisipasi.add(new Participation(4.5, tmp_p, daftar_RA.get(7)));
        daftar_partisipasi.add(new Participation(1, tmp_p, daftar_RA.get(9)));
        daftar_partisipasi.add(new Participation(2.5, tmp_p, daftar_RA.get(11)));

        //Partisipasi di project 3
        tmp_p = daftar_project.get(2);
        daftar_partisipasi.add(new Participation(2, tmp_p, daftar_RA.get(12)));
        daftar_partisipasi.add(new Participation(1.5, tmp_p, daftar_RA.get(15)));
        daftar_partisipasi.add(new Participation(3, tmp_p, daftar_RA.get(17)));

        //Testing tiap bagian
        //Print daftar administrative_employee
        for(Administrative_Employee ae : daftar_AE){
            System.out.println(ae);
        }

        //Print daftar research_associate
        for(Research_Associate ra : daftar_RA){
            System.out.println(ra);
        }
        //Print banyak employee
        System.out.println(Employee.getCounter());

//        Print daftar fakultas
        for(Faculty f : daftar_fakultas){
            System.out.println(f);
        }

        //Print daftar institut
        for(Faculty f : daftar_fakultas){
            System.out.println(f.getName());
            for(Institute i: f.getInstitutes_list()){
                System.out.println(i);
            }
            System.out.println();
        }

        //Print daftar lecturer
        for(Lecturer l : daftar_lecturer){
            System.out.println(l);
        }

        //Print daftar matkul
        System.out.println("Mata kuliah komputer");
        for(Course c : matkul_komputer){
            System.out.println(c);
        }
        System.out.println();

        System.out.println("Mata kuliah teknik");
        for(Course c : matkul_teknik){
            System.out.println(c);
        }
        System.out.println();

        System.out.println("Mata kuliah ekonomi");
        for(Course c : matkul_ekonomi){
            System.out.println(c);
        }

        //Print daftar ajar
        for(Teaching t : daftar_ajar){
            System.out.println(t);
        }

        //Print daftar project
        for(Project p : daftar_project){
            System.out.println(p);
        }

        //Print daftar partisipasi
        for(Participation p: daftar_partisipasi){
            System.out.println(p);
        }
    }
}

