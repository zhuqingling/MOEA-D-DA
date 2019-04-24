package jmetal.problems.NCTP;

/**
 * Created by stu on 16/7/8.
 */
public class NCTP17 extends NCTP{

    public NCTP17(String solutionType, Integer decisionNumber) throws ClassCastException{
        super(solutionType,2,decisionNumber,new double[]{-0.2 * Math.PI,0.75,10,1,0.5,1,2.5});
        problemName_ = "NCTP17";
    }

}
