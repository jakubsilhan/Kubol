// Generated from C:/Users/kubix/source/repos/PRK/Language_Kubol/src/main/antlr4/KubolParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class KubolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IS=1, ADD=2, MULTIPLY=3, DETERMINE=4, END_DETERMINE=5, EQUAL=6, LESSER=7, 
		GREATER=8, NONEQUAL=9, THRU=10, END_THRU=11, IMAGINE=12, L_BRACK=13, R_BRACK=14, 
		SEP=15, INT=16, ID=17, WS=18;
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_assignment = 2, RULE_equation = 3, 
		RULE_calcOperator = 4, RULE_calcMember = 5, RULE_conditionalStatement = 6, 
		RULE_condition = 7, RULE_comparisonOperator = 8, RULE_cycleStatement = 9, 
		RULE_cycleCondition = 10, RULE_printStatement = 11, RULE_variable = 12, 
		RULE_value = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "statement", "assignment", "equation", "calcOperator", "calcMember", 
			"conditionalStatement", "condition", "comparisonOperator", "cycleStatement", 
			"cycleCondition", "printStatement", "variable", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IS'", "'ADD'", "'MULTIPLY'", "'DETERMINE'", "'END_DETERMINE'", 
			"'EQUAL'", "'LESSER'", "'GREATER'", "'NONEQUAL'", "'THRU'", "'END_THRU'", 
			"'IMAGINE'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IS", "ADD", "MULTIPLY", "DETERMINE", "END_DETERMINE", "EQUAL", 
			"LESSER", "GREATER", "NONEQUAL", "THRU", "END_THRU", "IMAGINE", "L_BRACK", 
			"R_BRACK", "SEP", "INT", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KubolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KubolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KubolParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136208L) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public CycleStatementContext cycleStatement() {
			return getRuleContext(CycleStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				assignment();
				}
				break;
			case DETERMINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				conditionalStatement();
				}
				break;
			case THRU:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				cycleStatement();
				}
				break;
			case IMAGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				printStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IS() { return getToken(KubolParser.IS, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			variable();
			setState(43);
			match(IS);
			setState(44);
			equation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public List<CalcMemberContext> calcMember() {
			return getRuleContexts(CalcMemberContext.class);
		}
		public CalcMemberContext calcMember(int i) {
			return getRuleContext(CalcMemberContext.class,i);
		}
		public CalcOperatorContext calcOperator() {
			return getRuleContext(CalcOperatorContext.class,0);
		}
		public TerminalNode L_BRACK() { return getToken(KubolParser.L_BRACK, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(KubolParser.R_BRACK, 0); }
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_equation);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				calcMember();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				calcMember();
				setState(48);
				calcOperator();
				setState(49);
				calcMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				calcMember();
				setState(52);
				calcOperator();
				setState(53);
				match(L_BRACK);
				setState(54);
				equation();
				setState(55);
				match(R_BRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(KubolParser.ADD, 0); }
		public TerminalNode MULTIPLY() { return getToken(KubolParser.MULTIPLY, 0); }
		public CalcOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitCalcOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcOperatorContext calcOperator() throws RecognitionException {
		CalcOperatorContext _localctx = new CalcOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_calcOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MULTIPLY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcMemberContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CalcMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcMember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitCalcMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcMemberContext calcMember() throws RecognitionException {
		CalcMemberContext _localctx = new CalcMemberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_calcMember);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode DETERMINE() { return getToken(KubolParser.DETERMINE, 0); }
		public TerminalNode L_BRACK() { return getToken(KubolParser.L_BRACK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(KubolParser.R_BRACK, 0); }
		public TerminalNode END_DETERMINE() { return getToken(KubolParser.END_DETERMINE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(DETERMINE);
			setState(66);
			match(L_BRACK);
			setState(67);
			condition();
			setState(68);
			match(R_BRACK);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 136208L) != 0) );
			setState(74);
			match(END_DETERMINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<CalcMemberContext> calcMember() {
			return getRuleContexts(CalcMemberContext.class);
		}
		public CalcMemberContext calcMember(int i) {
			return getRuleContext(CalcMemberContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			calcMember();
			setState(77);
			comparisonOperator();
			setState(78);
			calcMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(KubolParser.EQUAL, 0); }
		public TerminalNode LESSER() { return getToken(KubolParser.LESSER, 0); }
		public TerminalNode GREATER() { return getToken(KubolParser.GREATER, 0); }
		public TerminalNode NONEQUAL() { return getToken(KubolParser.NONEQUAL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleStatementContext extends ParserRuleContext {
		public TerminalNode THRU() { return getToken(KubolParser.THRU, 0); }
		public TerminalNode L_BRACK() { return getToken(KubolParser.L_BRACK, 0); }
		public CycleConditionContext cycleCondition() {
			return getRuleContext(CycleConditionContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(KubolParser.R_BRACK, 0); }
		public TerminalNode END_THRU() { return getToken(KubolParser.END_THRU, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CycleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycleStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitCycleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleStatementContext cycleStatement() throws RecognitionException {
		CycleStatementContext _localctx = new CycleStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cycleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(THRU);
			setState(83);
			match(L_BRACK);
			setState(84);
			cycleCondition();
			setState(85);
			match(R_BRACK);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 136208L) != 0) );
			setState(91);
			match(END_THRU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleConditionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode IS() { return getToken(KubolParser.IS, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(KubolParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(KubolParser.SEP, i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public CalcOperatorContext calcOperator() {
			return getRuleContext(CalcOperatorContext.class,0);
		}
		public CycleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycleCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitCycleCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleConditionContext cycleCondition() throws RecognitionException {
		CycleConditionContext _localctx = new CycleConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cycleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			variable();
			setState(94);
			match(IS);
			setState(95);
			value();
			setState(96);
			match(SEP);
			setState(97);
			variable();
			setState(98);
			comparisonOperator();
			setState(99);
			value();
			setState(100);
			match(SEP);
			setState(101);
			variable();
			setState(102);
			calcOperator();
			setState(103);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode IMAGINE() { return getToken(KubolParser.IMAGINE, 0); }
		public TerminalNode L_BRACK() { return getToken(KubolParser.L_BRACK, 0); }
		public TerminalNode R_BRACK() { return getToken(KubolParser.R_BRACK, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IMAGINE);
			setState(106);
			match(L_BRACK);
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(107);
				variable();
				}
				break;
			case 2:
				{
				setState(108);
				value();
				}
				break;
			case 3:
				{
				setState(109);
				equation();
				}
				break;
			}
			setState(112);
			match(R_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KubolParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KubolParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubolParserVisitor ) return ((KubolParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012w\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005@\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006G\b\u0006\u000b\u0006\f\u0006H\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\tX\b\t\u000b\t\f\tY\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bo\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0002"+
		"\u0001\u0000\u0002\u0003\u0001\u0000\u0006\tt\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000"+
		"\u00069\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n?\u0001\u0000"+
		"\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000"+
		"\u0010P\u0001\u0000\u0000\u0000\u0012R\u0001\u0000\u0000\u0000\u0014]"+
		"\u0001\u0000\u0000\u0000\u0016i\u0001\u0000\u0000\u0000\u0018r\u0001\u0000"+
		"\u0000\u0000\u001at\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \""+
		"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0000"+
		"\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$)\u0003\u0004\u0002\u0000"+
		"%)\u0003\f\u0006\u0000&)\u0003\u0012\t\u0000\')\u0003\u0016\u000b\u0000"+
		"($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0003"+
		"\u0018\f\u0000+,\u0005\u0001\u0000\u0000,-\u0003\u0006\u0003\u0000-\u0005"+
		"\u0001\u0000\u0000\u0000.:\u0003\n\u0005\u0000/0\u0003\n\u0005\u00000"+
		"1\u0003\b\u0004\u000012\u0003\n\u0005\u00002:\u0001\u0000\u0000\u0000"+
		"34\u0003\n\u0005\u000045\u0003\b\u0004\u000056\u0005\r\u0000\u000067\u0003"+
		"\u0006\u0003\u000078\u0005\u000e\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"9.\u0001\u0000\u0000\u00009/\u0001\u0000\u0000\u000093\u0001\u0000\u0000"+
		"\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0007\u0000\u0000\u0000<\t\u0001"+
		"\u0000\u0000\u0000=@\u0003\u001a\r\u0000>@\u0003\u0018\f\u0000?=\u0001"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u000b\u0001\u0000\u0000"+
		"\u0000AB\u0005\u0004\u0000\u0000BC\u0005\r\u0000\u0000CD\u0003\u000e\u0007"+
		"\u0000DF\u0005\u000e\u0000\u0000EG\u0003\u0002\u0001\u0000FE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000"+
		"K\r\u0001\u0000\u0000\u0000LM\u0003\n\u0005\u0000MN\u0003\u0010\b\u0000"+
		"NO\u0003\n\u0005\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0007\u0001\u0000"+
		"\u0000Q\u0011\u0001\u0000\u0000\u0000RS\u0005\n\u0000\u0000ST\u0005\r"+
		"\u0000\u0000TU\u0003\u0014\n\u0000UW\u0005\u000e\u0000\u0000VX\u0003\u0002"+
		"\u0001\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u000b\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000]^\u0003\u0018"+
		"\f\u0000^_\u0005\u0001\u0000\u0000_`\u0003\u001a\r\u0000`a\u0005\u000f"+
		"\u0000\u0000ab\u0003\u0018\f\u0000bc\u0003\u0010\b\u0000cd\u0003\u001a"+
		"\r\u0000de\u0005\u000f\u0000\u0000ef\u0003\u0018\f\u0000fg\u0003\b\u0004"+
		"\u0000gh\u0003\u001a\r\u0000h\u0015\u0001\u0000\u0000\u0000ij\u0005\f"+
		"\u0000\u0000jn\u0005\r\u0000\u0000ko\u0003\u0018\f\u0000lo\u0003\u001a"+
		"\r\u0000mo\u0003\u0006\u0003\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0005\u000e\u0000\u0000q\u0017\u0001\u0000\u0000"+
		"\u0000rs\u0005\u0011\u0000\u0000s\u0019\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0010\u0000\u0000u\u001b\u0001\u0000\u0000\u0000\u0007\u001f(9?HYn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}