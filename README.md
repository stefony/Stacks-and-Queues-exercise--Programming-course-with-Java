# Stacks-and-Queues-exercise--Programming-course-with-Java
Courses from my education Java fundamental  in @SoftUni
01.	 Blacksmith
You are the most well-known blacksmith on Middle Earth. What makes your swords so good is the perfect ratio between steel and carbon, which makes them extremely sharp and durable.
First, you will be given a sequence representing steel. Afterward, you will be given another sequence representing carbon.
You should start from the first steel and try to mix it with the last carbon. If the sum of their values is equal to any of the swords in the table below you should forge the sword corresponding to the value and remove both the steel and the carbon. Otherwise, remove only the steel, increase the value of the carbon by 5 and insert it back into the collection. You need to stop forging when you have no more steel or carbon left.
Sword	Resources needed
Gladius	70
Shamshir	80
Katana	90
Sabre	110
First you will be given a sequence representing steel. You will then be given another sequence representing carbon.
You should start from the first steel and try to mix it with the last carbon. If the sum of their values equals any of the swords in the table below, you must forge the sword matching the value and remove the steel and carbon. Otherwise, remove just the steel, increase the carbon value by 5, and put it back in the collection. You must stop forging when you run out of steel or carbon.Forge as many swords as possible.
Input
•	On the first line, you will receive the steel, separated by a single space (" "). 
•	On the second line, you will receive the carbon, separated by a single space (" ").
Output
•	On the first line of output depending on the result:
o	If at least one sword was forged: "You have forged {totalNumberOfSwords} swords."
o	If no sword was forged: "You did not have enough resources to forge a sword."
•	On the second line - print all steel you have left:
o	If there are no steel: "Steel left: none"
o	If there are steel: "Steel left: {steel1}, {steel2}, {steel3}, (…)"
•	On the third line - print all carbon you have left:
o	If there are no carbon: "Carbon left: none"
o	If there are carbon: "Carbon left: {carbon1}, {carbon2}, {carbon3}, (…)"
•	Then, you need to print only the swords that you manage to forge and how many of them, ordered alphabetically:
o	"Sabre: {amount}"
o	"Katana: {amount}"
o	"Shamshir: {amount}"
o	"Gladius: {amount}"
Constraints
•	All of the given numbers will be valid resources in the range [0, 130].
02.Food Finder
You will be given two sequences of characters, representing vowels and consonants. Your task is to start checking if the following words could be created:
•	"pear"
•	"flour"
•	"pork"
•	"olive"
Start by taking the first character of the vowels collection and the last character from the consonants collection. Then check if these letters are present in one or more of the given words. If these letters are present, you should store the information. Then process to the next couple of letters until there are no more consonant letters left. 
A letter (vowels or consonants) could participate in more than one word, for example:
The letter 'o' is present in  "flour", "pork", and "olive". 
The letter 'l' is present in "flour", and "olive".
Keep in mind that:
•	A vowel letter is always returned to the collection, whether used or not.
•	A consonant letter is always removed from the collection, whether used or not.
You will be given two sequences of characters representing vowels and consonants. Your task is to start checking whether the following words can be created:
• "pear"
• "flour"
• "pork"
• "olive"
Start by taking the first character from the vowel collection and the last character from the consonant collection. Then check whether these letters are present in one or more of the given words. If these letters are present, you should save the information. Then move on to the next few letters until there are no more consonants left.
A single letter (vowels or consonants) can be part of more than one word, for example:
The letter "o" is present in "flour", "pork" and "olives".
The letter "l" is present in "flour" and "olive".
Note that the:
• A vowel is always returned to the collection, whether it is used or not.
• A consonant is always removed from the collection, regardless of whether it is used or notAs a result, you should check how many of the given words were found and print:
"Words found: {numberOfWordsFound} 
{wordOne}
{wordTwo}
…"
Look at the provided examples for a better understanding of the problem.
Input
•	On the first line, you will receive characters representing the vowels, separated by a single space (" ").
•	On the second line, you will receive characters representing the consonants, separated by a single space (" ").
Output
•	As a result, print on the first line how many words have been found and on the next N lines, every word:
"Words found: {numberOfWordsFound} 
{wordOne}
{wordTwo}
…"
Print words in the same order as in the problem's description.
Constraints
•	All letters will be lowercase.
•	All letters in the given words are unique.
There will be no case where no word is
03.It’s Chocolate Time

You love chocolate and we have prepared plenty of different types of chocolate only for you.
First, you will receive a sequence of doubles, representing the milk quantity for the preparation of single chocolate. After that, you will be given another sequence of doubles - the cacao powder quantity.
Your task is to mix them so you can prepare the chocolates, listed in the table below with different cacao percentages. 
First you will get a sequence of doubles representing the amount of milk to make a single chocolate bar. You will then be given another sequence of doubles - the amount of cocoa powder.
Your task is to mix them so that you can prepare the chocolates indicated in the table below with different percentages of cocoa.
Chocolate types	Cacao percentage
Milk Chocolate	30
Dark Chocolate	50
Baking Chocolate	100
To prepare chocolate, you have to take the first milk value and the last cacao powder value. The cacao percentage is calculated by dividing the cacao powder value by the sum of the milk and cacao powder values. If the result of this operation equals one of the point levels described in the table, you make the chocolate and remove both milk and cacao powder values. Otherwise, you should remove the cacao powder value, increase the milk value by 10, then remove it from the first position and add it at the end. You need to stop producing chocolates when you run out of milk or cacao powder values.
To make chocolate, you need to take the first amount of milk and the last amount of cocoa powder. The cocoa percentage is calculated by dividing the cocoa powder value by the sum of the milk and cocoa powder values. If the result of this operation equals one of the point levels described in the table, you make the chocolate and remove both the milk and cocoa powder values. Otherwise, you must remove the cocoa powder value, increase the milk value by 10, then remove it from the first position and add it last. You must stop making chocolates when the values of milk or cocoa powder run out.

Your task is considered done if you make at least three chocolates - one of each type.
Input
•	The first line of input will represent the milk values - doubles, separated by a single space.
•	On the second line, you will be given the cacao powder values - doubles again, separated by a single space.
Output
•	On the first line of output - print whether you've succeeded in preparing the chocolates
o	"It’s a Chocolate Time. All chocolate types are prepared."
o	"Sorry, but you didn't succeed to prepare all types of chocolates."
•	In the next few lines, you have to print the chocolates you have made at least once, ordered alphabetically in the format:
" # {chocolate type} --> {amount}".
Constraints
•	All values will be doubles in the range [0, 200].

04. KAT

Your task is to optimize the performance of the KAT. By helping them reduce the queue of cars waiting for registration.
You will be given two sequences of integers – one with license plates and one with cars. Two license plates are required for each car. Your goal is to find the number of registered cars and how many days they are installed. If there are cars or license plates that have not been used, you should count them.
The installation starts from the first license plate with the last cars. If, after the end of the day, license plates remain, they are added at the end of the sequence for a new day. If after the end of the first day there are cars without license plates, they are added at the beginning of the sequence for a new day. The procedure is performed until at least one sequence is over.
Input
•	On the first line, you will receive the integers representing the number of license plates, separated by ", ". 
•	On the second line, you will receive the integers representing the number of cars, separated by ", ".
Output
•	Print count of registered cars and how many days were needed:
o	“{count of registered cars} cars were registered for {count of days} days!”
•	If there are any remaining license plates:
o	“{count of plates} license plates remain!”
•	If any cars are remaining without license plates:
o	“{count of cars without license plates} cars remain without license plates!”
•	If all cars and license plates were used:
o	"Good job! There is no queue in front of the KAT!"
Constraints
•	License plates will be even numbers.
•	All of the given numbers for license plates will be valid integers in the range [4, 2147483646].
•	All of the given numbers for cars will be valid integers in the range [2, 2147483647].

