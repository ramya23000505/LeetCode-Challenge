class Solution {
    public double average(int[] salary) 
    {
        double minSalary = Double.MAX_VALUE;
        double maxSalary = -Double.MAX_VALUE;
        double sum = 0;

        for(int i = 0; i < salary.length; i++)
        {
            if (salary[i] < minSalary) minSalary = salary[i];
            if (salary[i] > maxSalary) maxSalary = salary[i];
            sum += salary[i];
        }    
        return (sum - minSalary - maxSalary) / (salary.length - 2);
    }
}