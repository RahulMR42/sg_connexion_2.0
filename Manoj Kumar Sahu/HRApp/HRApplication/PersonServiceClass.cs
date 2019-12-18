using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HRApplication
{
    public class PersonServiceClass
    {
        List<Person> lstPerson = new List<Person>();

        public void SavePerson(Person p)
        {
            lstPerson.Add(p);
        }

        public Person FindPersonByName(string p)
        {
            Person objPerson = lstPerson.Find(m => m.Name == p);
            return objPerson;
        }

        public Person FindPersonByExperience(int experience)
        {
            Person objPerson = lstPerson.Find(m => m.YearsOfExperience == experience);
            return objPerson;
        }
    }
}
