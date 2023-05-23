// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, VARIAVEL=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_REL=8, OP_ARIT=9, DELIM=10, ABREPAR=11, FECHAPAR=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\f\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000f\b"+
		"\u0000\u0001\u0001\u0003\u0001i\b\u0001\u0001\u0001\u0004\u0001l\b\u0001"+
		"\u000b\u0001\f\u0001m\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0002\u0004"+
		"\u0002t\b\u0002\u000b\u0002\f\u0002u\u0001\u0002\u0001\u0002\u0004\u0002"+
		"z\b\u0002\u000b\u0002\f\u0002{\u0003\u0002~\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0089\b\u0004\n\u0004\f\u0004\u008c\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0095\b\u0006\n\u0006\f\u0006\u0098\t\u0006\u0001\u0006"+
		"\u0003\u0006\u009b\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ac\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0000\r\u0006\u000f\u0007"+
		"\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f\u0001\u0000\u0007\u0002\u0000"+
		"++--\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u0000\n\n\u0002\u0000\n\n"+
		"\r\r\u0003\u0000\t\n\r\r  \u0003\u0000*+--//\u00d0\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0001e\u0001\u0000\u0000\u0000\u0003"+
		"h\u0001\u0000\u0000\u0000\u0005p\u0001\u0000\u0000\u0000\u0007\u007f\u0001"+
		"\u0000\u0000\u0000\t\u0086\u0001\u0000\u0000\u0000\u000b\u008f\u0001\u0000"+
		"\u0000\u0000\r\u0092\u0001\u0000\u0000\u0000\u000f\u009f\u0001\u0000\u0000"+
		"\u0000\u0011\u00ab\u0001\u0000\u0000\u0000\u0013\u00ad\u0001\u0000\u0000"+
		"\u0000\u0015\u00af\u0001\u0000\u0000\u0000\u0017\u00b1\u0001\u0000\u0000"+
		"\u0000\u0019\u00b3\u0001\u0000\u0000\u0000\u001b\u001c\u0005D\u0000\u0000"+
		"\u001c\u001d\u0005E\u0000\u0000\u001d\u001e\u0005C\u0000\u0000\u001e\u001f"+
		"\u0005L\u0000\u0000\u001f \u0005A\u0000\u0000 !\u0005R\u0000\u0000!\""+
		"\u0005A\u0000\u0000\"#\u0005C\u0000\u0000#$\u0005O\u0000\u0000$%\u0005"+
		"E\u0000\u0000%f\u0005S\u0000\u0000&\'\u0005A\u0000\u0000\'(\u0005L\u0000"+
		"\u0000()\u0005G\u0000\u0000)*\u0005O\u0000\u0000*+\u0005R\u0000\u0000"+
		"+,\u0005I\u0000\u0000,-\u0005T\u0000\u0000-.\u0005M\u0000\u0000.f\u0005"+
		"O\u0000\u0000/0\u0005I\u0000\u000001\u0005N\u0000\u00001f\u0005T\u0000"+
		"\u000023\u0005R\u0000\u000034\u0005E\u0000\u000045\u0005A\u0000\u0000"+
		"5f\u0005L\u0000\u000067\u0005A\u0000\u000078\u0005T\u0000\u000089\u0005"+
		"R\u0000\u00009:\u0005I\u0000\u0000:;\u0005B\u0000\u0000;<\u0005U\u0000"+
		"\u0000<=\u0005I\u0000\u0000=f\u0005R\u0000\u0000>f\u0005A\u0000\u0000"+
		"?@\u0005L\u0000\u0000@A\u0005E\u0000\u0000Af\u0005R\u0000\u0000BC\u0005"+
		"I\u0000\u0000CD\u0005M\u0000\u0000DE\u0005P\u0000\u0000EF\u0005R\u0000"+
		"\u0000FG\u0005I\u0000\u0000GH\u0005M\u0000\u0000HI\u0005I\u0000\u0000"+
		"If\u0005R\u0000\u0000JK\u0005S\u0000\u0000Kf\u0005E\u0000\u0000LM\u0005"+
		"E\u0000\u0000MN\u0005N\u0000\u0000NO\u0005T\u0000\u0000OP\u0005A\u0000"+
		"\u0000Pf\u0005O\u0000\u0000QR\u0005E\u0000\u0000RS\u0005N\u0000\u0000"+
		"ST\u0005Q\u0000\u0000TU\u0005U\u0000\u0000UV\u0005A\u0000\u0000VW\u0005"+
		"N\u0000\u0000WX\u0005T\u0000\u0000Xf\u0005O\u0000\u0000YZ\u0005I\u0000"+
		"\u0000Z[\u0005N\u0000\u0000[\\\u0005I\u0000\u0000\\]\u0005C\u0000\u0000"+
		"]^\u0005I\u0000\u0000^f\u0005O\u0000\u0000_`\u0005F\u0000\u0000`a\u0005"+
		"I\u0000\u0000af\u0005M\u0000\u0000bf\u0005E\u0000\u0000cd\u0005O\u0000"+
		"\u0000df\u0005U\u0000\u0000e\u001b\u0001\u0000\u0000\u0000e&\u0001\u0000"+
		"\u0000\u0000e/\u0001\u0000\u0000\u0000e2\u0001\u0000\u0000\u0000e6\u0001"+
		"\u0000\u0000\u0000e>\u0001\u0000\u0000\u0000e?\u0001\u0000\u0000\u0000"+
		"eB\u0001\u0000\u0000\u0000eJ\u0001\u0000\u0000\u0000eL\u0001\u0000\u0000"+
		"\u0000eQ\u0001\u0000\u0000\u0000eY\u0001\u0000\u0000\u0000e_\u0001\u0000"+
		"\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000f\u0002"+
		"\u0001\u0000\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jl\u000209\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u0004\u0001\u0000\u0000\u0000oq\u0007"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rt\u000209\u0000sr\u0001\u0000\u0000\u0000t"+
		"u\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v}\u0001\u0000\u0000\u0000wy\u0005.\u0000\u0000xz\u000209\u0000"+
		"yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}w\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0006\u0001\u0000\u0000\u0000"+
		"\u007f\u0083\u0007\u0001\u0000\u0000\u0080\u0082\u0007\u0002\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\b\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u008a\u0005\'\u0000\u0000\u0087\u0089\b\u0003\u0000\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\'\u0000\u0000\u008e\n\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\\\u0000\u0000\u0090\u0091\u0005\'\u0000\u0000\u0091\f\u0001\u0000\u0000"+
		"\u0000\u0092\u0096\u0005%\u0000\u0000\u0093\u0095\b\u0004\u0000\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0005\r\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\n\u0000\u0000\u009d\u009e\u0006\u0006\u0000\u0000\u009e\u000e"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0005\u0000\u0000\u00a0\u00a1"+
		"\u0006\u0007\u0001\u0000\u00a1\u0010\u0001\u0000\u0000\u0000\u00a2\u00ac"+
		"\u0005>\u0000\u0000\u00a3\u00a4\u0005>\u0000\u0000\u00a4\u00ac\u0005="+
		"\u0000\u0000\u00a5\u00ac\u0005<\u0000\u0000\u00a6\u00a7\u0005<\u0000\u0000"+
		"\u00a7\u00ac\u0005=\u0000\u0000\u00a8\u00a9\u0005<\u0000\u0000\u00a9\u00ac"+
		"\u0005>\u0000\u0000\u00aa\u00ac\u0005=\u0000\u0000\u00ab\u00a2\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u0012\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0007\u0006\u0000\u0000\u00ae\u0014\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005:\u0000\u0000\u00b0\u0016\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005(\u0000\u0000\u00b2\u0018\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005)\u0000\u0000\u00b4\u001a\u0001\u0000\u0000\u0000\r"+
		"\u0000ehmpu{}\u0083\u008a\u0096\u009a\u00ab\u0002\u0001\u0006\u0000\u0001"+
		"\u0007\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}