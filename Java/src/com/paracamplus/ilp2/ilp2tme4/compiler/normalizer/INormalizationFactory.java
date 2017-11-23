/* *****************************************************************
 * ilp2 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp2
 * GPL version 3
 ***************************************************************** */
package com.paracamplus.ilp2.ilp2tme4.compiler.normalizer;


import com.paracamplus.ilp2.compiler.interfaces.IASTCfunctionDefinition;
import com.paracamplus.ilp2.compiler.interfaces.IASTCprogram;
import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interfaces.IASTvariable;

 public interface INormalizationFactory 
 	extends com.paracamplus.ilp1.compiler.normalizer.INormalizationFactory {

    IASTCprogram newProgram(IASTCfunctionDefinition[] functions, 
                            IASTexpression expression);


     IASTCfunctionDefinition newFunctionDefinition(
            IASTvariable functionVariable,
            IASTvariable[] variables,
            IASTexpression body);
    
    

     IASTexpression newAssignment(IASTvariable variable,
                                  IASTexpression value);

     IASTexpression newLoop(IASTexpression condition, 
                                  IASTexpression body);
     

}