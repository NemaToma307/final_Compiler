package Gremmers.visitor;

import Gremmers.AST;
import Gremmers.array.FloatArray;
import Gremmers.array.IntArray;
import Gremmers.array.StringArray;
import Gremmers.classes.AbstractStatment;
import Gremmers.classes.ClassStatement;
import Gremmers.classes.ExtendsClass;
import Gremmers.expr.Addition;
import Gremmers.expr.Division;
import Gremmers.expr.Multiplication;
import Gremmers.expr.Subtraction;
import Gremmers.functions.Functions;
import Gremmers.prog.Body;
import Gremmers.prog.Classes;
import Gremmers.prog.Element;
import Gremmers.prog.Program;
import Gremmers.var.Variable;
import Gremmers.var.varVariable;
import syntax.projectParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import syntax.projectParser;
import Gremmers.var.Float;
import Gremmers.var.Double;
import Gremmers.var.Number;
public class AntlrToAST extends projectParserBaseVisitor<AST> {

    @Override
    public Program visitProg(projectParser.ProgContext ctx) {
        Program pp = new Program();
        for(int i = 0 ; i< ctx.element().size() ;i++){
            pp.getElements().add(visitElement(ctx.element(i)));
        }
        return  pp ;
    }

    @Override
    public Element visitElement(projectParser.ElementContext ctx) {
        Element e = new Element();
        if(ctx.body() != null) {
            e.setBody(visitBody(ctx.body()));
        }
        return e;
    }


    @Override
    public Body visitBody(projectParser.BodyContext ctx) {
        Body body = new Body();
        if(ctx.class_() != null) {
            body.setClasses(visitClass(ctx.class_()));
        }
        if(ctx.functionStatement() != null) {
            body.setFunctions(visitFunctionStatement(ctx.functionStatement()));
        }
        return body;
    }

    @Override
    public AST visitFloat_f(projectParser.Float_fContext ctx) {
        Float float_p = new Float();
        float_p.setFLOAT(ctx.NUM_FLOAT().toString().trim());
        return float_p;
    }

    @Override
    public AST visitInt_i(projectParser.Int_iContext ctx) {
        return super.visitInt_i(ctx);
    }

    @Override
    public AST visitDouble_d(projectParser.Double_dContext ctx) {
        Double double_p = new Double();
        double_p.setDouble(ctx.NUM_DOUBLE().toString().trim());
        return double_p;
    }

    @Override
    public AST visitArrayType(projectParser.ArrayTypeContext ctx) {
        if(ctx.array_var() != null){

        }
        return
    }

    @Override
    public AST visitArray_var(projectParser.Array_varContext ctx) {
        return super.visitArray_var(ctx);
    }

    @Override
    public AST visitArray_int(projectParser.Array_intContext ctx) {
        IntArray intArray = new IntArray();
        for(int i=0; i<ctx.NUM().size();i++){
            intArray.addChild(Integer.parseInt(ctx.NUM().get(i).getText()));
        }
        return intArray;
    }

    @Override
    public AST visitArray_string(projectParser.Array_stringContext ctx) {
        StringArray stringArray = new StringArray();
        for(int i=0; i<ctx.ID().size();i++){
            stringArray.addChild(ctx.ID().get(i).getText());
        }
        return stringArray;
    }

    @Override
    public AST visitArray_float(projectParser.Array_floatContext ctx) {
        FloatArray floatArray = new FloatArray();
        for(int i=0; i<ctx.arrayFLOAT();i++){
            floatArray.addChild(ctx.arrayFLOAT().get(i).getText());
        }
        return floatArray;
    }

    @Override
    public AST visitArraybody(projectParser.ArraybodyContext ctx) {
        if(ctx.arrayINT() != null){

        }
        return
    }

    @Override
    public AST visitArrayINT(projectParser.ArrayINTContext ctx) {
        return super.visitArrayINT(ctx);
    }

    @Override
    public AST visitArraySTRING(projectParser.ArraySTRINGContext ctx) {
        return super.visitArraySTRING(ctx);
    }

    @Override
    public AST visitArrayFLOAT(projectParser.ArrayFLOATContext ctx) {
        return super.visitArrayFLOAT(ctx);
    }

    @Override
    public AST visitInitial(projectParser.InitialContext ctx) {
        return super.visitInitial(ctx);
    }

    @Override
    public AST visitVar_Variable(projectParser.Var_VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitVar_Variable_expr(projectParser.Var_Variable_exprContext ctx) {
        return super.visitVar_Variable_expr(ctx);
    }

    @Override
    public AST visitVar_Variable_emp(projectParser.Var_Variable_empContext ctx) {
        return super.visitVar_Variable_emp(ctx);
    }

    @Override
    public AST visitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitConst_Variable(projectParser.Const_VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitConst_Variable_expr(projectParser.Const_Variable_exprContext ctx) {
        return super.visitConst_Variable_expr(ctx);
    }

    @Override
    public AST visitConst_Variable_emp(projectParser.Const_Variable_empContext ctx) {
        return super.visitConst_Variable_emp(ctx);
    }

    @Override
    public AST visitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDynamic_Variable(projectParser.Dynamic_VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDynamic_Variable_expr(projectParser.Dynamic_Variable_exprContext ctx) {
        return super.visitDynamic_Variable_expr(ctx);
    }

    @Override
    public AST visitDynamic_Variable_emp(projectParser.Dynamic_Variable_empContext ctx) {
        return super.visitDynamic_Variable_emp(ctx);
    }

    @Override
    public AST visitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitFinal_Variable(projectParser.Final_VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitFinal_Variable_expr(projectParser.Final_Variable_exprContext ctx) {
        return super.visitFinal_Variable_expr(ctx);
    }

    @Override
    public AST visitFinal_Variable_emp(projectParser.Final_Variable_empContext ctx) {
        return super.visitFinal_Variable_emp(ctx);
    }

    @Override
    public AST visitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx) {
        return super.visitString_Variable_TEXT(ctx);
    }

    @Override
    public AST visitInt_Variable(projectParser.Int_VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitInt_Variable_expr(projectParser.Int_Variable_exprContext ctx) {
        return super.visitInt_Variable_expr(ctx);
    }

    @Override
    public AST visitInt_Variable_emp(projectParser.Int_Variable_empContext ctx) {
        return super.visitInt_Variable_emp(ctx);
    }

    @Override
    public AST visitFloat_Variable(projectParser.Float_VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM_FLOAT().getText());
        String value = ctx.NUM_FLOAT().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDouble_Variable(projectParser.Double_VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM_DOUBLE().getText());
        String value = ctx.NUM_DOUBLE().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitBoolean_Variable(projectParser.Boolean_VariableContext ctx) {
        return super.visitBoolean_Variable(ctx);
    }

    @Override
    public AST visitLoop(projectParser.LoopContext ctx) {
        return super.visitLoop(ctx);
    }

    @Override
    public AST visitFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx) {
        return super.visitFor_VAR_With_ID_ID(ctx);
    }

    @Override
    public AST visitFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx) {
        return super.visitFor_INT_With_ID_ID(ctx);
    }

    @Override
    public AST visitFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx) {
        return super.visitFor_VAR_With_ID_NUM(ctx);
    }

    @Override
    public AST visitFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx) {
        return super.visitFor_INT_With_ID_NUM(ctx);
    }

    @Override
    public AST visitPrintstatement(projectParser.PrintstatementContext ctx) {
        return super.visitPrintstatement(ctx);
    }

    @Override
    public AST visitPrint_ID(projectParser.Print_IDContext ctx) {
        return super.visitPrint_ID(ctx);
    }

    @Override
    public AST visitPrint_NUM(projectParser.Print_NUMContext ctx) {
        return super.visitPrint_NUM(ctx);
    }

    @Override
    public AST visitPrint_TEXT(projectParser.Print_TEXTContext ctx) {
        return super.visitPrint_TEXT(ctx);
    }

    @Override
    public AST visitRule(projectParser.RuleContext ctx) {
        return super.visitRule(ctx);
    }

    @Override
    public AST visitIfstatement(projectParser.IfstatementContext ctx) {
        return super.visitIfstatement(ctx);
    }

    @Override
    public AST visitIf_WithInput(projectParser.If_WithInputContext ctx) {
        return super.visitIf_WithInput(ctx);
    }

    @Override
    public AST visitIf_WithBreak(projectParser.If_WithBreakContext ctx) {
        return super.visitIf_WithBreak(ctx);
    }

    @Override
    public AST visitIf_WithContinue(projectParser.If_WithContinueContext ctx) {
        return super.visitIf_WithContinue(ctx);
    }

    @Override
    public AST visitWhilestatemen(projectParser.WhilestatemenContext ctx) {
        return super.visitWhilestatemen(ctx);
    }

    @Override
    public AST visitWhile_WithInput(projectParser.While_WithInputContext ctx) {
        return super.visitWhile_WithInput(ctx);
    }

    @Override
    public AST visitWhile_WithBreak(projectParser.While_WithBreakContext ctx) {
        return super.visitWhile_WithBreak(ctx);
    }

    @Override
    public AST visitWhile_WithContinue(projectParser.While_WithContinueContext ctx) {
        return super.visitWhile_WithContinue(ctx);
    }

    @Override
    public AST visitSwitchstatement(projectParser.SwitchstatementContext ctx) {
        return super.visitSwitchstatement(ctx);
    }

    @Override
    public AST visitSwitch_With_ID(projectParser.Switch_With_IDContext ctx) {
        return super.visitSwitch_With_ID(ctx);
    }

    @Override
    public AST visitSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx) {
        return super.visitSwitch_With_NUM(ctx);
    }

    @Override
    public AST visitCasestatement(projectParser.CasestatementContext ctx) {
        return super.visitCasestatement(ctx);
    }

    @Override
    public AST visitCase_With_ID(projectParser.Case_With_IDContext ctx) {
        return super.visitCase_With_ID(ctx);
    }

    @Override
    public AST visitCase_With_NUM(projectParser.Case_With_NUMContext ctx) {
        return super.visitCase_With_NUM(ctx);
    }

    @Override
    public AST visitDefaultstatement(projectParser.DefaultstatementContext ctx) {
        return super.visitDefaultstatement(ctx);
    }

    @Override
    public AST visitTryCatchstatement(projectParser.TryCatchstatementContext ctx) {
        return super.visitTryCatchstatement(ctx);
    }

    @Override
    public AST visitBoolean_p(projectParser.Boolean_pContext ctx) {
        return super.visitBoolean_p(ctx);
    }

    @Override
    public AST visitNumbers(projectParser.NumbersContext ctx) {
        return super.visitNumbers(ctx);
    }

    @Override
    public AST visitVar(projectParser.VarContext ctx) {
        return super.visitVar(ctx);
    }

    @Override
    public AST visitExpression(projectParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public AST visitMath(projectParser.MathContext ctx) {
        return super.visitMath(ctx);
    }

    @Override
    public AST visitBoolExpresion(projectParser.BoolExpresionContext ctx) {
        return super.visitBoolExpresion(ctx);
    }

    @Override
    public AST visitLogic(projectParser.LogicContext ctx) {
        return super.visitLogic(ctx);
    }

    @Override
    public AST visitNestedLogic(projectParser.NestedLogicContext ctx) {
        return super.visitNestedLogic(ctx);
    }

    @Override
    public AST visitNestedLogic2(projectParser.NestedLogic2Context ctx) {
        return super.visitNestedLogic2(ctx);
    }

    @Override
    public AST visitConditions(projectParser.ConditionsContext ctx) {
        return super.visitConditions(ctx);
    }

    @Override
    public AST visitOperation(projectParser.OperationContext ctx) {
        return super.visitOperation(ctx);
    }

    @Override
    public AST visitDoWhilestatement(projectParser.DoWhilestatementContext ctx) {
        return super.visitDoWhilestatement(ctx);
    }

    @Override
    public AST visitExpr(projectParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public AST visitMultiplication(projectParser.MultiplicationContext ctx) {
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Multiplication(left,right);
    }

    @Override
    public AST visitAddition(projectParser.AdditionContext ctx) {
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Addition(left,right);
    }

    @Override
    public AST visitSubtraction(projectParser.SubtractionContext ctx) {
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Subtraction(left,right);
    }

    @Override
    public AST visitDivision(projectParser.DivisionContext ctx) {
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Division(left,right);
    }

    @Override
    public AST visitIdentifier(projectParser.IdentifierContext ctx) {
        Token idtoken = ctx.ID().getSymbol();
        int line = idtoken.getLine();
        int column = idtoken.getCharPositionInLine() + 1 ;

        String id = ctx.getChild(0).getText();
        return new Variable(id);
    }

    @Override
    public AST visitInteger(projectParser.IntegerContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override
    public Functions visitFunctionStatement(projectParser.FunctionStatementContext ctx) {
        return super.visitFunctionStatement(ctx);
    }

    @Override
    public AST visitVoid_Function_NOReturn_NoARG(projectParser.Void_Function_NOReturn_NoARGContext ctx) {
        return super.visitVoid_Function_NOReturn_NoARG(ctx);
    }

    @Override
    public AST visitInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx) {
        return super.visitInt_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx) {
        return super.visitString_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx) {
        return super.visitDouble_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx) {
        return super.visitFloat_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitVoid_Function_NOReturn_ARG(projectParser.Void_Function_NOReturn_ARGContext ctx) {
        return super.visitVoid_Function_NOReturn_ARG(ctx);
    }

    @Override
    public AST visitInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx) {
        return super.visitInt_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx) {
        return super.visitString_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx) {
        return super.visitDouble_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx) {
        return super.visitFloate_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx) {
        return super.visitArgumentFunctionType(ctx);
    }

    @Override
    public AST visitReturnStatement(projectParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Classes visitClass(projectParser.ClassContext ctx) {
        Classes clas = new Classes();
        if(ctx.classstatement() != null){
            clas.setClassStatement(visitClassstatement(ctx.classstatement()));
        }
        if(ctx.abstractstatment() != null){
           clas.setAbstractStatment(visitAbstractstatment(ctx.abstractstatment()));
        }
        if(ctx.extendsClass() != null){
            clas.setExtendsClass(visitExtendsClass(ctx.extendsClass()));
        }
        return clas;
    }

    @Override
    public ClassStatement visitClassstatement(projectParser.ClassstatementContext ctx) {
        return super.visitClassstatement(ctx);
    }

    @Override
    public AbstractStatment visitAbstractstatment(projectParser.AbstractstatmentContext ctx) {
        return super.visitAbstractstatment(ctx);
    }

    @Override
    public ExtendsClass visitExtendsClass(projectParser.ExtendsClassContext ctx) {
        return super.visitExtendsClass(ctx);
    }

    @Override
    public AST visitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx) {
        return super.visitExtends_ClassStatment_Withinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx) {
        return super.visitExtends_ClassStatment_Withoutinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx) {
        return super.visitExtends_ClassStateFull(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx) {
        return super.visitExtends_ClassStateLess(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFull_WithAppBar(projectParser.Extends_ClassStateFull_WithAppBarContext ctx) {
        return super.visitExtends_ClassStateFull_WithAppBar(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLess_WithAppBar(projectParser.Extends_ClassStateLess_WithAppBarContext ctx) {
        return super.visitExtends_ClassStateLess_WithAppBar(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx) {
        return super.visitExtends_ClassStateFullwithinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx) {
        return super.visitExtends_ClassStateLesswithinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFullwithinput_appBar(projectParser.Extends_ClassStateFullwithinput_appBarContext ctx) {
        return super.visitExtends_ClassStateFullwithinput_appBar(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLesswithinput_appBar(projectParser.Extends_ClassStateLesswithinput_appBarContext ctx) {
        return super.visitExtends_ClassStateLesswithinput_appBar(ctx);
    }

    @Override
    public AST visitInput_AppBar(projectParser.Input_AppBarContext ctx) {
        return super.visitInput_AppBar(ctx);
    }

    @Override
    public AST visitColor(projectParser.ColorContext ctx) {
        return super.visitColor(ctx);
    }

    @Override
    public AST visitContainer_withflutterWidget(projectParser.Container_withflutterWidgetContext ctx) {
        return super.visitContainer_withflutterWidget(ctx);
    }

    @Override
    public AST visitRowStatement(projectParser.RowStatementContext ctx) {
        return super.visitRowStatement(ctx);
    }

    @Override
    public AST visitColStatemenst(projectParser.ColStatemenstContext ctx) {
        return super.visitColStatemenst(ctx);
    }

    @Override
    public AST visitTexeStatement(projectParser.TexeStatementContext ctx) {
        return super.visitTexeStatement(ctx);
    }

    @Override
    public AST visitText_INPUT_D_Q_N(projectParser.Text_INPUT_D_Q_NContext ctx) {
        return super.visitText_INPUT_D_Q_N(ctx);
    }

    @Override
    public AST visitText_INPUT_D_Q_I(projectParser.Text_INPUT_D_Q_IContext ctx) {
        return super.visitText_INPUT_D_Q_I(ctx);
    }

    @Override
    public AST visitText_rule(projectParser.Text_ruleContext ctx) {
        return super.visitText_rule(ctx);
    }

    @Override
    public AST visitSizedBox(projectParser.SizedBoxContext ctx) {
        return super.visitSizedBox(ctx);
    }

    @Override
    public AST visitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx) {
        return super.visitHight_SizedBox(ctx);
    }

    @Override
    public AST visitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx) {
        return super.visitWidth_SizedBox(ctx);
    }

    @Override
    public AST visitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx) {
        return super.visitWidthHight_SizedBox(ctx);
    }

    @Override
    public AST visitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx) {
        return super.visitHightWidth_SizedBox(ctx);
    }

    @Override
    public AST visitTextButton(projectParser.TextButtonContext ctx) {
        return super.visitTextButton(ctx);
    }

    @Override
    public AST visitImageState(projectParser.ImageStateContext ctx) {
        return super.visitImageState(ctx);
    }

    @Override
    public AST visitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx) {
        return super.visitImage_withAssetImage(ctx);
    }

    @Override
    public AST visitImage_withAssetImage_WithDirection(projectParser.Image_withAssetImage_WithDirectionContext ctx) {
        return super.visitImage_withAssetImage_WithDirection(ctx);
    }

    @Override
    public AST visitImage_withAssetImage_WithDirection_fit(projectParser.Image_withAssetImage_WithDirection_fitContext ctx) {
        return super.visitImage_withAssetImage_WithDirection_fit(ctx);
    }

    @Override
    public AST visitImage_withAsset(projectParser.Image_withAssetContext ctx) {
        return super.visitImage_withAsset(ctx);
    }

    @Override
    public AST visitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx) {
        return super.visitImage_withNetWoek(ctx);
    }

    @Override
    public AST visitImage_withFile(projectParser.Image_withFileContext ctx) {
        return super.visitImage_withFile(ctx);
    }

    @Override
    public AST visitImageDirection(projectParser.ImageDirectionContext ctx) {
        return super.visitImageDirection(ctx);
    }

    @Override
    public AST visitImageFit(projectParser.ImageFitContext ctx) {
        return super.visitImageFit(ctx);
    }

    @Override
    public AST visitExpandedStatment(projectParser.ExpandedStatmentContext ctx) {
        return super.visitExpandedStatment(ctx);
    }

    @Override
    public AST visitExpanded_withCol(projectParser.Expanded_withColContext ctx) {
        return super.visitExpanded_withCol(ctx);
    }

    @Override
    public AST visitExpanded_withRow(projectParser.Expanded_withRowContext ctx) {
        return super.visitExpanded_withRow(ctx);
    }

    @Override
    public AST visitPaddingStatement(projectParser.PaddingStatementContext ctx) {
        return super.visitPaddingStatement(ctx);
    }

    @Override
    public AST visitPadding_all(projectParser.Padding_allContext ctx) {
        return super.visitPadding_all(ctx);
    }

    @Override
    public AST visitPadding_sym_vertical_num(projectParser.Padding_sym_vertical_numContext ctx) {
        return super.visitPadding_sym_vertical_num(ctx);
    }

    @Override
    public AST visitPadding_sym_vertical_numFloat(projectParser.Padding_sym_vertical_numFloatContext ctx) {
        return super.visitPadding_sym_vertical_numFloat(ctx);
    }

    @Override
    public AST visitPadding_sym_horisantal_num(projectParser.Padding_sym_horisantal_numContext ctx) {
        return super.visitPadding_sym_horisantal_num(ctx);
    }

    @Override
    public AST visitPadding_sym_horisantal_numFloat(projectParser.Padding_sym_horisantal_numFloatContext ctx) {
        return super.visitPadding_sym_horisantal_numFloat(ctx);
    }

    @Override
    public AST visitPadding_only(projectParser.Padding_onlyContext ctx) {
        return super.visitPadding_only(ctx);
    }

    @Override
    public AST visitDirection(projectParser.DirectionContext ctx) {
        return super.visitDirection(ctx);
    }

    @Override
    public AST visitFlutterWidget(projectParser.FlutterWidgetContext ctx) {
        return super.visitFlutterWidget(ctx);
    }

    @Override
    public AST visitInput(projectParser.InputContext ctx) {
        return super.visitInput(ctx);
    }

    @Override
    public AST visitInputclass(projectParser.InputclassContext ctx) {
        return super.visitInputclass(ctx);
    }
}