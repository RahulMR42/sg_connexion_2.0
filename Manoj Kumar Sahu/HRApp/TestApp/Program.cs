using HRApplication;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("How many persons data do you want to save?");
            int count = Convert.ToInt32(Console.ReadLine());

            Person objPerson;
            PersonServiceClass objPersonServiceClass = new PersonServiceClass();


            for (int i = 0; i < count; i++)
            {
                Console.WriteLine("Enter name:");
                string name = Console.ReadLine();

                Console.WriteLine("Enter Experience:");
                int experience = Convert.ToInt32(Console.ReadLine());

                objPerson = new Person();
                objPerson.Name = name;
                objPerson.YearsOfExperience = experience;


                objPersonServiceClass.SavePerson(objPerson);
            }

            //Search Person
            Console.WriteLine();

            Console.WriteLine("How do you want to search (by name or experience)?");
            string searchKey = Console.ReadLine();

            if (searchKey == "name")
            {
                Console.WriteLine("Enter name to be searched:");
                string searchByName = Console.ReadLine();

                Person objPerson2 = objPersonServiceClass.FindPersonByName(searchByName);

                Console.WriteLine();

                if (objPerson2 != null)
                    Console.WriteLine("Found " + objPerson2.Name);
                else
                    Console.WriteLine("Not found");
            }
            else if (searchKey == "experience")
            {
                Console.WriteLine("Enter experience to be searched:");
                int searchByExperience = Convert.ToInt32(Console.ReadLine());

                Person objPerson2 = objPersonServiceClass.FindPersonByExperience(searchByExperience);

                Console.WriteLine();

                if (objPerson2 != null)
                    Console.WriteLine("Found " + objPerson2.Name);
                else
                    Console.WriteLine("Not found");
            }

            Console.ReadLine();
        }
    }
}
