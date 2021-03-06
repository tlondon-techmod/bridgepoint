/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtuml.bp.xtext.masl.masl.behavior.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFactory init() {
		try {
			BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviorPackage.eNS_URI);
			if (theBehaviorFactory != null) {
				return theBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviorPackage.STATEMENT_LIST: return createStatementList();
			case BehaviorPackage.CODE_BLOCK: return createCodeBlock();
			case BehaviorPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case BehaviorPackage.EXCEPTION_HANDLER: return createExceptionHandler();
			case BehaviorPackage.DEFAULT_EXCEPTION_HANDLER: return createDefaultExceptionHandler();
			case BehaviorPackage.STATEMENT: return createStatement();
			case BehaviorPackage.EXPRESSION: return createExpression();
			case BehaviorPackage.EXIT_STATEMENT: return createExitStatement();
			case BehaviorPackage.RETURN_STATEMENT: return createReturnStatement();
			case BehaviorPackage.DELAY_STATEMENT: return createDelayStatement();
			case BehaviorPackage.RAISE_STATEMENT: return createRaiseStatement();
			case BehaviorPackage.DELETE_STATEMENT: return createDeleteStatement();
			case BehaviorPackage.ERASE_STATEMENT: return createEraseStatement();
			case BehaviorPackage.SCHEDULE_STATEMENT: return createScheduleStatement();
			case BehaviorPackage.CANCEL_TIMER_STATEMENT: return createCancelTimerStatement();
			case BehaviorPackage.GENERATE_STATEMENT: return createGenerateStatement();
			case BehaviorPackage.IF_STATEMENT: return createIfStatement();
			case BehaviorPackage.ELSIF_BLOCK: return createElsifBlock();
			case BehaviorPackage.ELSE_BLOCK: return createElseBlock();
			case BehaviorPackage.WHILE_STATEMENT: return createWhileStatement();
			case BehaviorPackage.CASE_STATEMENT: return createCaseStatement();
			case BehaviorPackage.CASE_ALTERNATIVE: return createCaseAlternative();
			case BehaviorPackage.CASE_OTHERS: return createCaseOthers();
			case BehaviorPackage.FOR_STATEMENT: return createForStatement();
			case BehaviorPackage.LOOP_VARIABLE: return createLoopVariable();
			case BehaviorPackage.CODE_BLOCK_STATEMENT: return createCodeBlockStatement();
			case BehaviorPackage.FIND_CONDITION: return createFindCondition();
			case BehaviorPackage.CONST_EXPRESSION: return createConstExpression();
			case BehaviorPackage.SORT_ORDER: return createSortOrder();
			case BehaviorPackage.SORT_ORDER_COMPONENT: return createSortOrderComponent();
			case BehaviorPackage.SORT_ORDER_FEATURE: return createSortOrderFeature();
			case BehaviorPackage.CREATE_EXPRESSION: return createCreateExpression();
			case BehaviorPackage.CREATE_ARGUMENT: return createCreateArgument();
			case BehaviorPackage.FIND_EXPRESSION: return createFindExpression();
			case BehaviorPackage.FEATURE_CALL: return createFeatureCall();
			case BehaviorPackage.SIMPLE_FEATURE_CALL: return createSimpleFeatureCall();
			case BehaviorPackage.REAL_LITERAL: return createRealLiteral();
			case BehaviorPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case BehaviorPackage.STRING_LITERAL: return createStringLiteral();
			case BehaviorPackage.CHARACTER_LITERAL: return createCharacterLiteral();
			case BehaviorPackage.DURATION_LITERAL: return createDurationLiteral();
			case BehaviorPackage.TIMESTAMP_LITERAL: return createTimestampLiteral();
			case BehaviorPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case BehaviorPackage.NULL_LITERAL: return createNullLiteral();
			case BehaviorPackage.FLUSH_LITERAL: return createFlushLiteral();
			case BehaviorPackage.THIS_LITERAL: return createThisLiteral();
			case BehaviorPackage.CONSOLE_LITERAL: return createConsoleLiteral();
			case BehaviorPackage.ENDL_LITERAL: return createEndlLiteral();
			case BehaviorPackage.LINE_NO_LITERAL: return createLineNoLiteral();
			case BehaviorPackage.FILE_NAME_LITERAL: return createFileNameLiteral();
			case BehaviorPackage.ATTRIBUTE_REFERENTIAL: return createAttributeReferential();
			case BehaviorPackage.ASSIGN_STATEMENT: return createAssignStatement();
			case BehaviorPackage.STREAM_EXPRESSION: return createStreamExpression();
			case BehaviorPackage.RANGE_EXPRESSION: return createRangeExpression();
			case BehaviorPackage.LOGICAL_OR: return createLogicalOr();
			case BehaviorPackage.LOGICAL_XOR: return createLogicalXor();
			case BehaviorPackage.LOGICAL_AND: return createLogicalAnd();
			case BehaviorPackage.EQUALITY: return createEquality();
			case BehaviorPackage.RELATIONAL_EXP: return createRelationalExp();
			case BehaviorPackage.ADDITIVE_EXP: return createAdditiveExp();
			case BehaviorPackage.MULT_EXP: return createMultExp();
			case BehaviorPackage.UNARY_EXP: return createUnaryExp();
			case BehaviorPackage.LINK_EXPRESSION: return createLinkExpression();
			case BehaviorPackage.NAVIGATE_EXPRESSION: return createNavigateExpression();
			case BehaviorPackage.ACTION_CALL: return createActionCall();
			case BehaviorPackage.TERMINATOR_ACTION_CALL: return createTerminatorActionCall();
			case BehaviorPackage.INDEXED_EXPRESSION: return createIndexedExpression();
			case BehaviorPackage.CHARACTERISTIC_CALL: return createCharacteristicCall();
			case BehaviorPackage.STRUCTURE_AGGREGATE_EXPRESSION: return createStructureAggregateExpression();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviorPackage.LINK_TYPE:
				return createLinkTypeFromString(eDataType, initialValue);
			case BehaviorPackage.SCHEDULE_TYPE:
				return createScheduleTypeFromString(eDataType, initialValue);
			case BehaviorPackage.FIND_TYPE:
				return createFindTypeFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviorPackage.LINK_TYPE:
				return convertLinkTypeToString(eDataType, instanceValue);
			case BehaviorPackage.SCHEDULE_TYPE:
				return convertScheduleTypeToString(eDataType, instanceValue);
			case BehaviorPackage.FIND_TYPE:
				return convertFindTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList createStatementList() {
		StatementListImpl statementList = new StatementListImpl();
		return statementList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler createExceptionHandler() {
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultExceptionHandler createDefaultExceptionHandler() {
		DefaultExceptionHandlerImpl defaultExceptionHandler = new DefaultExceptionHandlerImpl();
		return defaultExceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitStatement createExitStatement() {
		ExitStatementImpl exitStatement = new ExitStatementImpl();
		return exitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayStatement createDelayStatement() {
		DelayStatementImpl delayStatement = new DelayStatementImpl();
		return delayStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseStatement createRaiseStatement() {
		RaiseStatementImpl raiseStatement = new RaiseStatementImpl();
		return raiseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteStatement createDeleteStatement() {
		DeleteStatementImpl deleteStatement = new DeleteStatementImpl();
		return deleteStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EraseStatement createEraseStatement() {
		EraseStatementImpl eraseStatement = new EraseStatementImpl();
		return eraseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleStatement createScheduleStatement() {
		ScheduleStatementImpl scheduleStatement = new ScheduleStatementImpl();
		return scheduleStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelTimerStatement createCancelTimerStatement() {
		CancelTimerStatementImpl cancelTimerStatement = new CancelTimerStatementImpl();
		return cancelTimerStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateStatement createGenerateStatement() {
		GenerateStatementImpl generateStatement = new GenerateStatementImpl();
		return generateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElsifBlock createElsifBlock() {
		ElsifBlockImpl elsifBlock = new ElsifBlockImpl();
		return elsifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseBlock createElseBlock() {
		ElseBlockImpl elseBlock = new ElseBlockImpl();
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseStatement createCaseStatement() {
		CaseStatementImpl caseStatement = new CaseStatementImpl();
		return caseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseAlternative createCaseAlternative() {
		CaseAlternativeImpl caseAlternative = new CaseAlternativeImpl();
		return caseAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseOthers createCaseOthers() {
		CaseOthersImpl caseOthers = new CaseOthersImpl();
		return caseOthers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopVariable createLoopVariable() {
		LoopVariableImpl loopVariable = new LoopVariableImpl();
		return loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlockStatement createCodeBlockStatement() {
		CodeBlockStatementImpl codeBlockStatement = new CodeBlockStatementImpl();
		return codeBlockStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindCondition createFindCondition() {
		FindConditionImpl findCondition = new FindConditionImpl();
		return findCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstExpression createConstExpression() {
		ConstExpressionImpl constExpression = new ConstExpressionImpl();
		return constExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortOrder createSortOrder() {
		SortOrderImpl sortOrder = new SortOrderImpl();
		return sortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortOrderComponent createSortOrderComponent() {
		SortOrderComponentImpl sortOrderComponent = new SortOrderComponentImpl();
		return sortOrderComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortOrderFeature createSortOrderFeature() {
		SortOrderFeatureImpl sortOrderFeature = new SortOrderFeatureImpl();
		return sortOrderFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateExpression createCreateExpression() {
		CreateExpressionImpl createExpression = new CreateExpressionImpl();
		return createExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArgument createCreateArgument() {
		CreateArgumentImpl createArgument = new CreateArgumentImpl();
		return createArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindExpression createFindExpression() {
		FindExpressionImpl findExpression = new FindExpressionImpl();
		return findExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCall createFeatureCall() {
		FeatureCallImpl featureCall = new FeatureCallImpl();
		return featureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFeatureCall createSimpleFeatureCall() {
		SimpleFeatureCallImpl simpleFeatureCall = new SimpleFeatureCallImpl();
		return simpleFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealLiteral createRealLiteral() {
		RealLiteralImpl realLiteral = new RealLiteralImpl();
		return realLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterLiteral createCharacterLiteral() {
		CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
		return characterLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationLiteral createDurationLiteral() {
		DurationLiteralImpl durationLiteral = new DurationLiteralImpl();
		return durationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampLiteral createTimestampLiteral() {
		TimestampLiteralImpl timestampLiteral = new TimestampLiteralImpl();
		return timestampLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlushLiteral createFlushLiteral() {
		FlushLiteralImpl flushLiteral = new FlushLiteralImpl();
		return flushLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisLiteral createThisLiteral() {
		ThisLiteralImpl thisLiteral = new ThisLiteralImpl();
		return thisLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsoleLiteral createConsoleLiteral() {
		ConsoleLiteralImpl consoleLiteral = new ConsoleLiteralImpl();
		return consoleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndlLiteral createEndlLiteral() {
		EndlLiteralImpl endlLiteral = new EndlLiteralImpl();
		return endlLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineNoLiteral createLineNoLiteral() {
		LineNoLiteralImpl lineNoLiteral = new LineNoLiteralImpl();
		return lineNoLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameLiteral createFileNameLiteral() {
		FileNameLiteralImpl fileNameLiteral = new FileNameLiteralImpl();
		return fileNameLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeReferential createAttributeReferential() {
		AttributeReferentialImpl attributeReferential = new AttributeReferentialImpl();
		return attributeReferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignStatement createAssignStatement() {
		AssignStatementImpl assignStatement = new AssignStatementImpl();
		return assignStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamExpression createStreamExpression() {
		StreamExpressionImpl streamExpression = new StreamExpressionImpl();
		return streamExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeExpression createRangeExpression() {
		RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
		return rangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOr createLogicalOr() {
		LogicalOrImpl logicalOr = new LogicalOrImpl();
		return logicalOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalXor createLogicalXor() {
		LogicalXorImpl logicalXor = new LogicalXorImpl();
		return logicalXor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalAnd createLogicalAnd() {
		LogicalAndImpl logicalAnd = new LogicalAndImpl();
		return logicalAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExp createRelationalExp() {
		RelationalExpImpl relationalExp = new RelationalExpImpl();
		return relationalExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveExp createAdditiveExp() {
		AdditiveExpImpl additiveExp = new AdditiveExpImpl();
		return additiveExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultExp createMultExp() {
		MultExpImpl multExp = new MultExpImpl();
		return multExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExp createUnaryExp() {
		UnaryExpImpl unaryExp = new UnaryExpImpl();
		return unaryExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkExpression createLinkExpression() {
		LinkExpressionImpl linkExpression = new LinkExpressionImpl();
		return linkExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigateExpression createNavigateExpression() {
		NavigateExpressionImpl navigateExpression = new NavigateExpressionImpl();
		return navigateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCall createActionCall() {
		ActionCallImpl actionCall = new ActionCallImpl();
		return actionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminatorActionCall createTerminatorActionCall() {
		TerminatorActionCallImpl terminatorActionCall = new TerminatorActionCallImpl();
		return terminatorActionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexedExpression createIndexedExpression() {
		IndexedExpressionImpl indexedExpression = new IndexedExpressionImpl();
		return indexedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicCall createCharacteristicCall() {
		CharacteristicCallImpl characteristicCall = new CharacteristicCallImpl();
		return characteristicCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAggregateExpression createStructureAggregateExpression() {
		StructureAggregateExpressionImpl structureAggregateExpression = new StructureAggregateExpressionImpl();
		return structureAggregateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue) {
		LinkType result = LinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleType createScheduleTypeFromString(EDataType eDataType, String initialValue) {
		ScheduleType result = ScheduleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScheduleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindType createFindTypeFromString(EDataType eDataType, String initialValue) {
		FindType result = FindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorPackage getBehaviorPackage() {
		return (BehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorPackage getPackage() {
		return BehaviorPackage.eINSTANCE;
	}

} //BehaviorFactoryImpl
