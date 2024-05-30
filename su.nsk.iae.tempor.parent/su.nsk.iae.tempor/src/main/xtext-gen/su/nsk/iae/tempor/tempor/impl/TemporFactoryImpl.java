/**
 * generated by Xtext 2.30.0
 */
package su.nsk.iae.tempor.tempor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import su.nsk.iae.tempor.tempor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporFactoryImpl extends EFactoryImpl implements TemporFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TemporFactory init()
  {
    try
    {
      TemporFactory theTemporFactory = (TemporFactory)EPackage.Registry.INSTANCE.getEFactory(TemporPackage.eNS_URI);
      if (theTemporFactory != null)
      {
        return theTemporFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TemporFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemporFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TemporPackage.MODEL: return createModel();
      case TemporPackage.DECL_VAR_INPUT: return createDeclVarInput();
      case TemporPackage.DECL_VAR_OUTPUT: return createDeclVarOutput();
      case TemporPackage.VAR_DECLARATION: return createVarDeclaration();
      case TemporPackage.SENT_DECLARATION: return createSentDeclaration();
      case TemporPackage.SENTENCE_DECLARATION: return createSentenceDeclaration();
      case TemporPackage.EXPRESSION: return createExpression();
      case TemporPackage.XOR_EXPRESSION: return createXorExpression();
      case TemporPackage.AND_EXPRESSION: return createAndExpression();
      case TemporPackage.COMP_EXPRESSION: return createCompExpression();
      case TemporPackage.EQU_EXPRESSION: return createEquExpression();
      case TemporPackage.UN_EXPRESSION: return createUnExpression();
      case TemporPackage.TAU_EXPRESSION: return createTauExpression();
      case TemporPackage.TIME_LITERAL: return createTimeLiteral();
      case TemporPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case TemporPackage.REQ_DECLARATION: return createReqDeclaration();
      case TemporPackage.REQUIREMENT: return createRequirement();
      case TemporPackage.TRIG: return createTrig();
      case TemporPackage.INV: return createInv();
      case TemporPackage.INV_ALWAYS: return createInv_always();
      case TemporPackage.REL_REA: return createRelRea();
      case TemporPackage.REA: return createRea();
      case TemporPackage.DEL_FIN: return createDelFin();
      case TemporPackage.DELAY: return createDelay();
      case TemporPackage.REL: return createRel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TemporPackage.EQU_OPERATOR:
        return createEquOperatorFromString(eDataType, initialValue);
      case TemporPackage.COMP_OPERATOR:
        return createCompOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TemporPackage.EQU_OPERATOR:
        return convertEquOperatorToString(eDataType, instanceValue);
      case TemporPackage.COMP_OPERATOR:
        return convertCompOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclVarInput createDeclVarInput()
  {
    DeclVarInputImpl declVarInput = new DeclVarInputImpl();
    return declVarInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclVarOutput createDeclVarOutput()
  {
    DeclVarOutputImpl declVarOutput = new DeclVarOutputImpl();
    return declVarOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SentDeclaration createSentDeclaration()
  {
    SentDeclarationImpl sentDeclaration = new SentDeclarationImpl();
    return sentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SentenceDeclaration createSentenceDeclaration()
  {
    SentenceDeclarationImpl sentenceDeclaration = new SentenceDeclarationImpl();
    return sentenceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XorExpression createXorExpression()
  {
    XorExpressionImpl xorExpression = new XorExpressionImpl();
    return xorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompExpression createCompExpression()
  {
    CompExpressionImpl compExpression = new CompExpressionImpl();
    return compExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EquExpression createEquExpression()
  {
    EquExpressionImpl equExpression = new EquExpressionImpl();
    return equExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnExpression createUnExpression()
  {
    UnExpressionImpl unExpression = new UnExpressionImpl();
    return unExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TauExpression createTauExpression()
  {
    TauExpressionImpl tauExpression = new TauExpressionImpl();
    return tauExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeLiteral createTimeLiteral()
  {
    TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
    return timeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReqDeclaration createReqDeclaration()
  {
    ReqDeclarationImpl reqDeclaration = new ReqDeclarationImpl();
    return reqDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Trig createTrig()
  {
    TrigImpl trig = new TrigImpl();
    return trig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inv createInv()
  {
    InvImpl inv = new InvImpl();
    return inv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inv_always createInv_always()
  {
    Inv_alwaysImpl inv_always = new Inv_alwaysImpl();
    return inv_always;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelRea createRelRea()
  {
    RelReaImpl relRea = new RelReaImpl();
    return relRea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rea createRea()
  {
    ReaImpl rea = new ReaImpl();
    return rea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DelFin createDelFin()
  {
    DelFinImpl delFin = new DelFinImpl();
    return delFin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Delay createDelay()
  {
    DelayImpl delay = new DelayImpl();
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rel createRel()
  {
    RelImpl rel = new RelImpl();
    return rel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquOperator createEquOperatorFromString(EDataType eDataType, String initialValue)
  {
    EquOperator result = EquOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEquOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompOperator createCompOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompOperator result = CompOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TemporPackage getTemporPackage()
  {
    return (TemporPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TemporPackage getPackage()
  {
    return TemporPackage.eINSTANCE;
  }

} //TemporFactoryImpl