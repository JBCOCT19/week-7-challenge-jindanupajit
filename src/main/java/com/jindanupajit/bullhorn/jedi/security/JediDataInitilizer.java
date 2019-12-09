package com.jindanupajit.bullhorn.jedi.security;

import com.jindanupajit.bullhorn.bluehorn.repository.PeopleRepository;
import com.jindanupajit.bullhorn.jedi.security.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class JediDataInitilizer implements CommandLineRunner {


    @Autowired
    PeopleRepository peopleRepository;

    @Autowired
    AuthorityRepository authorityeRepository;



    @Override
    @Transactional
    public void run(String... args) {
//        Verbose.printlnf("Begin ...");
//
//
//        Authority roleAdmin, roleUser;
//
//        if (authorityeRepository.count() == 0) {
//            Verbose.printlnf("Begin - role");
//            roleAdmin = new Authority("ADMIN");
//            roleUser = new Authority("USER");
//
//            Verbose.printlnf("Add Role('%s') and Role('%s')",roleAdmin.getAuthority(), roleUser.getAuthority());
//            authorityeRepository.saveAll(Arrays.asList(roleAdmin, roleUser));
//        } else {
//            Verbose.printlnf("Skipped - role");
//            Verbose.printlnf("roleRepository.findByAuthority(\"ADMIN\")");
//            roleAdmin = authorityeRepository.findByAuthority("ADMIN");
//            Verbose.printlnf("roleRepository.findByAuthority(\"USER\")");
//            roleUser = authorityeRepository.findByAuthority("USER");
//            Verbose.printlnf("End of finding");
//        }



//        if (peopleRepository.count() == 0) {
//            Verbose.printlnf("Begin - employee");
//            People employeeAdmin = new People("Administrator",
//                    "admin@example.com",
//                    PasswordEncoder.getInstance().encode("password"),
//                    Arrays.asList(roleAdmin, roleUser));
//                    employeeAdmin.setDepartment(deptIT);
//
//            Employee employeeKrissada = new Employee("Krissada",
//                    "krissada@example.com",
//                    PasswordEncoder.getInstance().encode("password"),
//                    Arrays.asList(roleAdmin, roleUser));
//                    employeeKrissada.setDepartment(deptIT);
//
//            Employee employeeJohnDoe = new Employee("John Doe",
//                    "john.doe@example.com",
//                    PasswordEncoder.getInstance().encode("password"),
//                    Collections.singletonList(roleUser));
//                    employeeJohnDoe.setDepartment(deptRND);
//
//            Employee employeeJaneDoe = new Employee("Jane Doe",
//                    "jane.doe@example.com",
//                    PasswordEncoder.getInstance().encode("password"),
//                    Collections.singletonList(roleUser));
//                    employeeJaneDoe.setDepartment(deptRND);
//
//            Employee employeeJackDoe = new Employee("Jack Doe",
//                    "jack.doe@example.com",
//                    PasswordEncoder.getInstance().encode("password"),
//                    Collections.singletonList(roleUser));
//                    employeeJackDoe.setDepartment(deptRND);
//
//            Verbose.printlnf("Add Employee('%s'), Employee('%s'), Employee('%s'), Employee('%s'), Employee('%s')",
//                    employeeAdmin, employeeKrissada,
//                    employeeJohnDoe, employeeJaneDoe, employeeJackDoe);
//            employeeRepository.saveAll(Arrays.asList(
//                    employeeAdmin, employeeKrissada,
//                    employeeJohnDoe, employeeJaneDoe, employeeJackDoe));
//
//            String name = "Fay Havlik\n" +
//                    "Brandie Pierpont\n" +
//                    "Ernesto Moncrief\n" +
//                    "Sharika Sheperd\n" +
//                    "Tam Jeffress\n" +
//                    "Hana Essex\n" +
//                    "Ty Shank\n" +
//                    "August Mcgivney\n" +
//                    "Mabelle Schuster\n" +
//                    "Remedios Yale\n" +
//                    "Shad Chaparro\n" +
//                    "Leeanna Ivy\n" +
//                    "Julissa Rossman\n" +
//                    "Keenan Raborn\n" +
//                    "Mack Atwater\n" +
//                    "Sharla Vanallen\n" +
//                    "Tonya Buchholtz\n" +
//                    "Marguerite Astin\n" +
//                    "Reda Albertson\n" +
//                    "Syble Goudy\n" +
//                    "Berenice Clymer\n" +
//                    "Felisha Timms\n" +
//                    "Jennine Mackinnon\n" +
//                    "Isela Rowlette\n" +
//                    "Lurlene Gribble\n" +
//                    "Gladis Gullett\n" +
//                    "Mireille Ludlum\n" +
//                    "Yesenia Kring\n" +
//                    "Justina Porco\n" +
//                    "Loyd Mccarver\n" +
//                    "Bruna Kober\n" +
//                    "Vesta Schlichting\n" +
//                    "Chastity Jinkins\n" +
//                    "Brigida Santoro\n" +
//                    "Deandrea Lafreniere\n" +
//                    "Milissa Beckerman\n" +
//                    "Erik Cundiff\n" +
//                    "Contessa Sheth\n" +
//                    "Amy Lesesne\n" +
//                    "Julianna Llamas\n" +
//                    "Marlys Sieg\n" +
//                    "Isabel Giardina\n" +
//                    "Marcelina Pinkham\n" +
//                    "Leatrice Kellerhouse\n" +
//                    "Ruben Dunleavy\n" +
//                    "Tonette Kleiber\n" +
//                    "Lenora Bradham\n" +
//                    "Elida Delaughter\n" +
//                    "Denis Alves\n" +
//                    "Morgan Lafontant";
//
//            List<String> allDisplayName = Arrays.asList(name.split("\n"));
//            Random r = new Random();
//            allDisplayName.forEach( (displayName) -> {
//                displayName = displayName.trim();
//
//                Employee employee = new Employee(displayName.trim(),
//                        displayName.trim().toLowerCase().replace(" ", ".")+"@example.com",
//                        PasswordEncoder.getInstance().encode("password"),
//                        Collections.singletonList(roleUser));
//                employee.setDepartment(allDepartment.get(r.nextInt(allDepartment.size())));
//                employeeRepository.save(employee);
//            } );
//
//        } else {
//            Verbose.printlnf("Skipped - employee");
//        }
//
//        Verbose.printlnf("End");

    }
}
