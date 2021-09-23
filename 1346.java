//Check If N and Its Double Exist
class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Set<Integer> check= new HashSet<>();
            
        for(int i=0;i<arr.length;i++)
        {
            //                              Divide only even numbers other wise there will be a remainder and the actual value might exist in original array
            if(check.contains(arr[i]*2) || (arr[i]%2==0 && check.contains(arr[i]/2)))
            {
                return true;
            }
            
            check.add(arr[i]);
        }
        
        return false;
    }
}

//Tc 0(N);
//SC 0(N);
