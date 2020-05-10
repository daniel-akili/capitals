/*
**********************************************
* program: capitals.java
* author: Daniel Akili
* summary: capitals.java is a game that alows the user to learn about countries
* of the world and their capital cities through a learning section and a quiz section.
* 
*********************************************
*/

import java.util.List;
import java.util.*;

class capitals {

    public static void main(String[] args){
   
        // Map to store each country to its capital city
        Map<String, String> map = new HashMap<String, String>();

        // array of countries
        String [] countries = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh",
                                "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China",
                                 "Colombia", "Comoros", "Democratic Republic of Congo", "Costa Rica", "Cote D'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia",
                                  "Federated State of Micronesia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", 
                                  "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Moldovia", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", 
                                  "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Republic of The Congo", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and The Grenadines", "Samoa", "San Marino", 
                                  "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trindad and Tobago", "Tunisia", "Turkey", 
                                  "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States of America", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"}; 
                        

        // array of capitals                          
        String [] capitals = { "Kabul", "Tirana", "Algiers", "Andorra La Vella", "Luanda", "Saint John's", "Buenos Aires", "Yerevan", "Canberra", "Vienna", "Baku", "Nassau", "Manama", "Dhaka", "Bridgetown", "Minsk", "Brussels", "Belmopan", "Porto-Novo", "Thimphu", "Sucre", "Sarajevo", "Gaborone", "Brasilia", "Bandar Seri Begawan", 
            "Sofia", "Ouagadougou", "Bujumbura", "Praia", "Phnom Pehn", "Yaounde", "Ottawa", "Bangui", "N'Djamena", "Santiago", "Beijing", "Bogota", "Moroni", "Kinshasa", "San Jose", "Yamoussoukro", "Zagreb", "Havana", "Nicosia", "Prague", "Copenhagen", "Djibouti", "Roseau", "Santo Domingo", "Quito", "Cairo", "San Salvador", "Malabo", "Asmara", "Tallinn", "Mbabane", "Addis Ababa", "Palikir", "Suva", "Helsinki", "Paris", "Libreville",
            "Banjul", "Tbilisi", "Berlin", "Accra", "Athens", "Saint George's", "Guatemala City", "Conakry", "Bissau", "Georgetown", "Port-Au-Prince", "Tegucigalpa", "Budapest", "Reykjavik", "New Dheli", "Jakarta", "Tehran", "Baghdad", "Dublin", "Jerusalem", "Rome", "Kingston", "Tokyo", "Amman", "Nur-Sultan", "Nairobi", "South Tarawa", "Pristina", "Kuwait City", "Bishkek", "Vientiane", "Riga", "Beirut", "Maseru", "Monrovia", 
            "Tripoli", "Vaduz", "Vilnius", "Luxembourg", "Antananarivo", "Lilongwe", "Kuala Lumpur", "Male", "Bamako", "Valletta", "Majuro", "Nouakchott", "Port Louis", "Mexico City", "Chisinau", "Monaco", "Ulaanbaatar", "Podgorica", "Rabat", "Maputo", "Nay Pyi Taw", "Windhoek", "Yaren District", "Kathmandu", "Amsterdam", "Wellington", "Managua", "Niamey", "Abuja", "PyongYang", "Skopje", "Oslo", "Muscat", "Islamabad", "Ngerulmud",
            "East Jerusalem", "Panama City", "Port Moresby", "Asuncion", "Lima", "Manila", "Warsaw", "Lisbon", "Doha", "Brazzaville", "Bucharest", "Moscow", "Kigali", "Basseterre", "Castries", "Kingstown", "Apia", "San Marino", "Sao Tome", "Riyadh", "Dakar", "Belgrade", "Victoria", "Freetown", "Singapore", "Bratislavia", "Ljubljana", "Honiara", "Mogadishu", "Pretoria", "Seoul", "Juba", "Madrid", "Colombo", "Khartoum", "Paramaribo", "Stockholm", "Bern", 
            "Damascus", "Dushanbe", "Dodoma", "Bangkok", "Dili", "Lome", "Nuku'Alofa", "Port of Spain", "Tunis", "Ankara", "Ashbagat", "Funafuti", "Kampala", "Kiev", "Abu Dhabi", "London", "Washington DC", "Montevideo", "Tashkent", "Port Vila", "Vatican City", "Caracas", "Hanoi", "Sana'a", "Lusaka", "Harare"};
            

        // map each country to its capital
        for (int i =0; i<countries.length; i++){
            map.put(countries[i], capitals[i]);

        }

        // welcoming message
        System.out.print("-----------------------------------\n");
        System.out.print("WELCOME TO OUR COUNTRY-CAPITAL GAME\n");
        System.out.print("-----------------------------------\n");
        
        // get user name 
        System.out.print("Hi there! What is your name?\n");

        String userName = System.console().readLine();      // read the user's name


        // Ask user if they want to learn or take a quiz
        System.out.print("\nHello " +userName +"! Please type 'L' to learn, 'Q' to take a quiz, or 'X' to quit\n") ;
        
        String userChoice = System.console().readLine();        // get the user's choice

        // while the user puts an incorrect argument
        while (!userChoice.equalsIgnoreCase("L") && !userChoice.equalsIgnoreCase("Q") && !userChoice.equalsIgnoreCase("X")){

            // print error message and ask them to put a correct command
            System.out.print("\nERROR: Command not found. Please type 'L' to learn, 'Q' to take a quiz, or 'X' to quit\n") ;
            userChoice = System.console().readLine();

        }
        

        // as long as the use hasn't chosen to quit
        while (!userChoice.equalsIgnoreCase("X")){

            // if user chose to learn
            if (userChoice.equalsIgnoreCase("L")){

                int matches =0;     // to check if the input matches any country in the list

                // ask the user to put the name of a country
                System.out.print("\nType the full name of a country or type 'X' to quit\n");

                // read the country name
                String userCountry = System.console().readLine();

                // if the user chose to quit the game
                if (userCountry.equalsIgnoreCase("X")){

                    // print goodbye message
                    System.out.print("\nThank you for learning with us. See you next time!\n");

                    System.exit(0);        // exit the program
                }

                String capital = "";        // variable to hold the capital
                String countryEntered= "";   // variable to hold the country matching the user's input

                //ignore cases
                for (String country: map.keySet()){
                    if (country.equalsIgnoreCase(userCountry)){
                        matches++;      // increase matches
                        // get the capital
                        countryEntered = country;
                        capital= map.get(country);   
                        
                    }    
                    
                    
                }

                // if there was no match with the country entered
                if (matches == 0){

                    // print error message
                    System.out.print("\nThe name entered does not match any country. Please review your input.\n");
            
                }

                else{
                    // otherwise, print the country and the capital city
                    System.out.print("The capital city of " +countryEntered +" is: " +capital + "\n");
                
                }

                
            }

            // if user chose to take a quiz
            else if (userChoice.equalsIgnoreCase("Q")){

                int numCorrect = 0;         // keep track of correct answers

                // create a list of 5 random countries
                int num = 5;
                List<String> quizCountries = new ArrayList<String>();

                for (int i = 0; i < num; i++){

                    int randIndex = (int) (Math.random() * countries.length);    // generate a random index
                    quizCountries.add(countries[randIndex]);        // add the country at that index to the list 
                
                    
                }

                System.out.print("THE QUIZ STARTS NOW!\n");

                int numberQuestion =1;      // to number each question

                List<String> failedQuestions = new ArrayList<String>();         // list of failed questions

                // Ask the user capitals of the 5 random countries
                for (int i = 0; i < quizCountries.size(); i++){
                    
                    // print question
                    System.out.print("\n" +numberQuestion +". What is the capital city of '" +quizCountries.get(i) +"'? " +"\n");
                    
                    // get user's answer
                    String answer = System.console().readLine();

                    // if the answer matches the capital
                    if (answer.equalsIgnoreCase(map.get(quizCountries.get(i)))){ 
                        numCorrect ++;      // increment the number of correct answers
                    }

                    else{
                        failedQuestions.add(quizCountries.get(i));      // add that country to the list of failed questions
                    }
                    

                    numberQuestion++;   // increment the question number

                }

                // Print the score
                System.out.print("\nYou score was " +numCorrect +" out of " +num +".\n" );

                // if the user did not get all the questions right, print the answers to questions failed:
                if (numCorrect != num){

                    // print all failed questions and the correct answers
                    System.out.print("\nFailed questions\n");
                    System.out.print("----------------");

                    for (int i = 0; i < failedQuestions.size(); i++){

                        System.out.print("\n" +failedQuestions.get(i) +": " +map.get(failedQuestions.get(i)));

                    }

                }


                System.out.print("\n \nType 'Q' to take another quiz or 'X' to quit.\n" );

                String userResponse = System.console().readLine();

                // as long as the user has not put a correct argument
                while(!userResponse.equalsIgnoreCase("Q") && !userResponse.equalsIgnoreCase("X")){

                    // print error message
                    System.out.print("\nERROR: Command not found. Please type 'Q' to take another quiz or 'X' to quit\n") ;
                    userResponse = System.console().readLine();
                    
                }

                // if the user chooses to quit the game
                if (userResponse.equalsIgnoreCase("X")){

                    // print goodbye message
                    System.out.print("\nThank you for taking the quiz. See you next time!\n" );
                    
                    // exit the program
                    System.exit(0);
                }
                

            }

        }
  
        System.exit(0);
            

   }
}