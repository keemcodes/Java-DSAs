import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class App {

    static void testFunc() {
        System.out.println("hi world");
    }

    static int[] twoSum(int[] nums, int target) {
        // Instantiate a hash map to store our needed value and it's location.
        // The needed value will be a "key". Our needed value's location in our array will be the "value".

        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop our array
        // Check if hashmap contains the needed value which is our key
        // Return the needed value's value from the hashmap and our our current location "i" if above condition is met
        // Store our current needed value and it's location
        // If loop ends with nothing found, return empty array.



        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    // This is a linear run time algorithm.
    // Looping over the array is linear. o(n)
    // Searching our hashmap is constant. o(1)
    // Pulling values from our hash map is constant. o(1)
    // Placing values in our hashmap is constant. o(1)

    // This breaks down to o(n) + o(1) + o(1) + o (1) which is o(n) after dropping our constants.


    static int reverse(int x) {
        // We can initilize our reversed integer as 0
        // We loop while x is not 0.
        // "Pop" our last digit by modding it by 10.
        // Then we divide our input by 10 to remove it's last digit.
        // Check our if we are outside the 32bit signed constaint for neg and pos. If we are, return 0.
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;

    

        // We can initilize our reversed integer as 0
        // We loop while x is not 0.
        // "Pop" our last digit by modding it by 10.
        // We then divide our input by 10 to remove the last digit.
        // We check if we are ourside our 32bit signed constraints.
        // We "push" our last digit on by multiplying our reversed integer by 10, then adding our popped value.



        // Our "pop" operation is pop = x % 10.
        // Our "push" operation is rev * 10 + pop

        // Plain english...
        // "pop" is simply modding our x by 10.
        // "push" is simply multiplying our rev by 10 then adding the pop.

    }

    static int reverseRight(int x) {
        int res = 0; 
        
        while (x != 0) {
            res += x % 10;
            int checker = res;
            
            x /= 10;
            
            if (x != 0) {
                res *= 10;
                if (res / 10 != checker) {
                    return 0;
                }
            }
        }
        
        return res;
    }

    // Using a long,
    public int rever(int x) {
		long r = 0;
		while(x != 0)
			r = r*10 + x%10;
			x /= 10;
		if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
		    return (int)r;
		else
		    return 0;
	}

    // Clean optimal way of writing this algorithm
    static int reverseClean(int x) {

        // 
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0: (int) res;
    }

    static int reverseUlt(int x) {
        int sol = 0; 
        while (x != 0) {
            sol += x % 10;
            int checker = sol;
            x /= 10;
            if (x != 0) {
                sol *= 10;
                if (sol / 10 != checker) {
                    return 0;
                }
            }
        }  
        return sol;
    }

    static int reversePrac(int x) {
        int sol = 0;
        while (x != 0) {
            sol += x % 10;
            // same as sol = sol + x % 10
            int checker = sol;
            x /= 10;
            if (x != 0) {

            }
        }
        return 0;
    }

    static int youtubeCommentsReverse(int x) {
        int rev = 0;
        while(x != 0)
        {   
            if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10) return 0;
            rev = rev * 10 + x % 10;
            x /= 10;
        }   
        return rev;         
    }

    static int revFunc(int x ) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) return 0;
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }





    static int revPrac2(int x) {

        // Initilize reverse integer to 0
        int rev = 0;

        // loop while input isn't 0.
        while (x != 0) {

            // check to make sure reverse integer is within our constraints, if not return 0;
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) return 0;

            // this line handles the popping and pushing of of value in order of operations.
            // we have to add a 0 to the end of our reverse integer so we can add our popped digit
            // rev * 10 basically adds 0 to the end of our digit.
            // then we add x modded by 10 to add the last digit. so basically, if we are reversing 123...
            // say we are at 32, to add 1 we have to multiply 32 by 10 to get 320, then we can add the 1 to get 321.
            rev = rev * 10 + x % 10;

            // divide input by 10 to remove the actual last digit from the input.
            // this needs to be done before the loop resets
            x /= 10;
        }
        // once loop is done, return rev. simple as cake.
        return rev;
    }

    static int revPrac4(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10 ) return 0;
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }


    static int revPrac9(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) return 0;
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }


    static int[] twoSumDawg(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[] {map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }


    static int reversePrac2(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) return 0;
            rev = rev * 10 + x % 10;
            x /= 0;
        }
        return rev;
    }



    static void printLoop(String string) {
        for (int i = 4; i >= 0; i--) {
        // for (int i = 0; i < 5; i++) {
        // for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": " + string);
        }
    }

    static void printIncrement() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    static void printDecrement() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
    static void NoInitilization() {
        int i = 0;
        for (; i > 0; i--) {
            System.out.println(i);
        }
    }
    static void IntegerArray() {
        int [] intArray = {1, 3, 5, 7, 9};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + ": " + intArray[i]);
        }
    }

    static void StringCharacters() {
        String string = "hello";
        for ( int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    static void StringArray() {
        String[] strings = { 
            "alpha",
            "beta",
            "gamma",
            "delta",
        };

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    static void ArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("alpha");
        list.add("beta");
        list.add("gamma");
        list.add("delta");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void LinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("alpha");
        list.add("beta");
        list.add("gamma");
        list.add("delta");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void HashSetLoop() {
        Set<String> set = new HashSet<>();
        set.add("alpha");
        set.add("alpha");
        set.add("alpha");
        set.add("beta");
        set.add("gamma");
        set.add("gamma");
        set.add("delta");
        set.add("belta");
        set.add("celta");

        // Not the best, could use work
        int index = 0;
        int end = 5;
        for (String ele : set) {
            if (index == end) break;
            System.out.println(index + ": " + ele);
            index++;
        }

        // for (int i = 0; i < set.size(); i++) {
        //     set.
        // }
    }
    static void WhileOutward() {
        int f = 0;
        int b = 16;
        while(f != b && b != f) {
            f++;
            b--;
            System.out.println("Forward: " + f + " Backward: " + b);
        }
    } 
    static int[] twoSumSlow(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (needed == nums[j]) return new int[] { i, j };
            }
        }
        return new int[] {};

    }
    static int[] twoSumFast(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[] {map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    static void EnhancedForLoop(String string) {
        char[] stringChar = string.toCharArray();
        int i = 0;
        for (char each : stringChar) {
            System.out.println(i++ + ": " + each);
        }
    }
    static void RegularForLoop(String string) {
        char[] stringChar = string.toCharArray();
        for (int i = 0; i < stringChar.length; i++) {
            System.out.println(i + ": " + stringChar[i]);
        }
    }
    static void StringLoop(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(i + ": " + string.charAt(i));
        }
    }

    // 
    static void IteratorTest() {
        ArrayList<String> s = new ArrayList<>();
        s.add("Volvo");
        s.add("BMW");
        s.add("Ford");
        s.add("Mazda");

        Iterator<String> it = s.iterator();

        System.out.println(it.next());

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    static void RemovingWithIterator() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it = numbers.iterator();

        // System.out.println(it.next());

        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
    // Study this algorithm later
    static int romanToInt(String input) {
        int ans = 0, num = 0;
        for (int i = input.length()-1; i >= 0; i--) {
            switch(input.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
    // static String longestCommonPrefix(String[] strs) {
        // Loop each string
        // We loop each character in string
        // Store each character as an index in an array
        // Or use a list to store character as key and occurances as value
        // Check if character exists, if so increment occurance
        // Check if occur

        // Multidimensional Array Solution?
        // Loop string array
        // Look each character
        // Store each character in a multidimisional array [i][char]
        // Check if char != char from previous string (unless on th e first string) [i][char] = [i-1][char]
        // if so, break out of loop and produce to next string
        // If we are on last string, 
        // return reult at end of all loops, cus all strings match
        // [0][0] == f
        // [1][3] == e
        // if [i][char] == [i-1][char]
        // 








    // }   

    // t sum two NOT ZERO BASED
    static int[] twoSumTwo(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;
        while (a <= b) {
            int sum = nums[a] + nums[b];
            if (sum > target) {
                b -= 1;
            }
            else if (sum < target) {
                a += 1;
            }
            else {
                return new int[] {a+1, b+1};
            }
        }
        return new int[] {a+1, b+1};
    }

    // FirstUnique Character in a String
    // Loop over each character and store it to a map
    // loop over map to find first character that appears once, return it's index

    // int firstNonRepeatingChar(String input)
    // Initilize a map
    // Loop over input
    // Check if map DOES NOT containskey...
    // ...place the key in the map and initilize the count value as 0.
    // increment the value
    // ...

    // After loop is complete loop over the keySet to find...
    // the first value thats 1, when found return it

    // loop over keyset
    // if key value = 1, return the current index

    static int firstNonRepeatingChar(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), 0);
            }
            map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }


    

    public static void main(String[] args) {
        // String[] strs = {"flower","flow","flight"};
        // String[] strs2 = {"dog","racecar","car"};
        // System.out.println(romanToInt("DCCC"));
        // System.out.println("Hello world");
        // WhileOutward();     
        // int[] numbers = { 2,5,7,9,15 };
        // System.out.println(Arrays.toString(twoSumTwo(numbers, 9)));
        // String result = Arrays.toString(twoSumSlow(numbers, 9));
        // System.out.println(result);
        System.out.println(firstNonRepeatingChar("inputinput"));
        // String[] list = {"uno", "dos", "tres"};
        // String txt = "Hello Darling";
        // // Reverse a string
        // for (int i = txt.length() - 1; i >= 0 ; i--) {
        //     System.out.print(txt.charAt(i));
        // } 

        // InLINE REVERSE INT TEST
        // int input = 1453333454;
        // int x = Math.abs(input);
        // int rev = 0;
        // while (x > 0) {
        //     int pop = x % 10;
        //     if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10 ) System.out.println("nope");;
        //     rev = rev * 10 + pop;
        //     x /= 10;
        // }
        // int ret = Integer.signum(input) * rev;
        // System.out.println(ret);

        // Normal Loop
        // for (int i = 0; i < list.length; i++) {
        //     System.out.println(list[i]);
        // }
        // Enhanced For Loop
        // for (String item : list) {
        //     System.out.println(item);
        // }
        // IteratorTest();
        // RemovingWithIterator();
        // StringLoop("The the realest to ever do it homie");


        // int number = 846384741;
        // int result = youtubeCommentsReverse(1563847412);
        // int result = youtubeCommentsReverse(number);


        // System.out.println(result);
        // printLoop("This is a test");
    }
}