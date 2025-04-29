// Generated from C:/Users/kubix/source/repos/PRK/Language_Kubol/src/main/antlr4/KubolLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class KubolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IS=1, ADD=2, MULTIPLY=3, DETERMINE=4, END_DETERMINE=5, EQUAL=6, LESSER=7, 
		GREATER=8, NONEQUAL=9, THRU=10, END_THRU=11, IMAGINE=12, L_BRACK=13, R_BRACK=14, 
		SEP=15, INT=16, ID=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IS", "ADD", "MULTIPLY", "DETERMINE", "END_DETERMINE", "EQUAL", "LESSER", 
			"GREATER", "NONEQUAL", "THRU", "END_THRU", "IMAGINE", "L_BRACK", "R_BRACK", 
			"SEP", "INT", "ID", "WS"
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


	public KubolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KubolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u00a2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0003"+
		"\u000f\u0089\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u008e"+
		"\b\u000f\n\u000f\f\u000f\u0091\t\u000f\u0003\u000f\u0093\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0097\b\u0010\n\u0010\f\u0010\u009a\t\u0010"+
		"\u0001\u0011\u0004\u0011\u009d\b\u0011\u000b\u0011\f\u0011\u009e\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"\u0001\u0000\u0005\u0001\u000019\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\f\r  \u00a6\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000"+
		"\u0000\u0005,\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t"+
		"?\u0001\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rS\u0001\u0000"+
		"\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000"+
		"\u0013k\u0001\u0000\u0000\u0000\u0015p\u0001\u0000\u0000\u0000\u0017y"+
		"\u0001\u0000\u0000\u0000\u0019\u0081\u0001\u0000\u0000\u0000\u001b\u0083"+
		"\u0001\u0000\u0000\u0000\u001d\u0085\u0001\u0000\u0000\u0000\u001f\u0088"+
		"\u0001\u0000\u0000\u0000!\u0094\u0001\u0000\u0000\u0000#\u009c\u0001\u0000"+
		"\u0000\u0000%&\u0005I\u0000\u0000&\'\u0005S\u0000\u0000\'\u0002\u0001"+
		"\u0000\u0000\u0000()\u0005A\u0000\u0000)*\u0005D\u0000\u0000*+\u0005D"+
		"\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005M\u0000\u0000-.\u0005"+
		"U\u0000\u0000./\u0005L\u0000\u0000/0\u0005T\u0000\u000001\u0005I\u0000"+
		"\u000012\u0005P\u0000\u000023\u0005L\u0000\u000034\u0005Y\u0000\u0000"+
		"4\u0006\u0001\u0000\u0000\u000056\u0005D\u0000\u000067\u0005E\u0000\u0000"+
		"78\u0005T\u0000\u000089\u0005E\u0000\u00009:\u0005R\u0000\u0000:;\u0005"+
		"M\u0000\u0000;<\u0005I\u0000\u0000<=\u0005N\u0000\u0000=>\u0005E\u0000"+
		"\u0000>\b\u0001\u0000\u0000\u0000?@\u0005E\u0000\u0000@A\u0005N\u0000"+
		"\u0000AB\u0005D\u0000\u0000BC\u0005_\u0000\u0000CD\u0005D\u0000\u0000"+
		"DE\u0005E\u0000\u0000EF\u0005T\u0000\u0000FG\u0005E\u0000\u0000GH\u0005"+
		"R\u0000\u0000HI\u0005M\u0000\u0000IJ\u0005I\u0000\u0000JK\u0005N\u0000"+
		"\u0000KL\u0005E\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005E\u0000"+
		"\u0000NO\u0005Q\u0000\u0000OP\u0005U\u0000\u0000PQ\u0005A\u0000\u0000"+
		"QR\u0005L\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005L\u0000\u0000"+
		"TU\u0005E\u0000\u0000UV\u0005S\u0000\u0000VW\u0005S\u0000\u0000WX\u0005"+
		"E\u0000\u0000XY\u0005R\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005"+
		"G\u0000\u0000[\\\u0005R\u0000\u0000\\]\u0005E\u0000\u0000]^\u0005A\u0000"+
		"\u0000^_\u0005T\u0000\u0000_`\u0005E\u0000\u0000`a\u0005R\u0000\u0000"+
		"a\u0010\u0001\u0000\u0000\u0000bc\u0005N\u0000\u0000cd\u0005O\u0000\u0000"+
		"de\u0005N\u0000\u0000ef\u0005E\u0000\u0000fg\u0005Q\u0000\u0000gh\u0005"+
		"U\u0000\u0000hi\u0005A\u0000\u0000ij\u0005L\u0000\u0000j\u0012\u0001\u0000"+
		"\u0000\u0000kl\u0005T\u0000\u0000lm\u0005H\u0000\u0000mn\u0005R\u0000"+
		"\u0000no\u0005U\u0000\u0000o\u0014\u0001\u0000\u0000\u0000pq\u0005E\u0000"+
		"\u0000qr\u0005N\u0000\u0000rs\u0005D\u0000\u0000st\u0005_\u0000\u0000"+
		"tu\u0005T\u0000\u0000uv\u0005H\u0000\u0000vw\u0005R\u0000\u0000wx\u0005"+
		"U\u0000\u0000x\u0016\u0001\u0000\u0000\u0000yz\u0005I\u0000\u0000z{\u0005"+
		"M\u0000\u0000{|\u0005A\u0000\u0000|}\u0005G\u0000\u0000}~\u0005I\u0000"+
		"\u0000~\u007f\u0005N\u0000\u0000\u007f\u0080\u0005E\u0000\u0000\u0080"+
		"\u0018\u0001\u0000\u0000\u0000\u0081\u0082\u0005(\u0000\u0000\u0082\u001a"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005)\u0000\u0000\u0084\u001c\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005;\u0000\u0000\u0086\u001e\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0005-\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0092\u0001\u0000\u0000"+
		"\u0000\u008a\u0093\u00050\u0000\u0000\u008b\u008f\u0007\u0000\u0000\u0000"+
		"\u008c\u008e\u0007\u0001\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000\u0000\u0000"+
		"\u0092\u008b\u0001\u0000\u0000\u0000\u0093 \u0001\u0000\u0000\u0000\u0094"+
		"\u0098\u0007\u0002\u0000\u0000\u0095\u0097\u0007\u0003\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0007\u0004\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0006\u0011\u0000\u0000\u00a1$\u0001\u0000\u0000\u0000\u0006\u0000\u0088"+
		"\u008f\u0092\u0098\u009e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}