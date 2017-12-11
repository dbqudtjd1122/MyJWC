package com.example.bsyoo.jwc.user.terms;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bsyoo.jwc.R;

public class TermsTabFragment1 extends TermsFragment {

    private View view = null;
    private TextView tv_termsinfo1;

    public TermsTabFragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_terms_tab_fragment1, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tv_termsinfo1 = (TextView) view.findViewById(R.id.tv_termsinfo1);
        tv_termsinfo1.setText(
                " 제1조(목적)\n" +
                        "   \n" +
                        "이 약관은 (주)제이더블유씨네트웍스 회사(전자거래 사업자)가 운영하는 JWC네트웍스 사이버 회사(이하 \"회사\"이라 한다)에서 제공하는 인터넷 관련 서비스(이하 \"서비스\"라 한다)를 이용함에 있어 사이버회사와 이용자의 권리·의무 및 책임사항을 규정함을 목적으로 합니다. \n" +
                        "※ 「PC통신등을 이용하는 전자거래에 대해서도 그 성질에 반하지 않는한 이 약관을 준용합니다」 \n" +
                        " \n" +
                        " \n" +
                        "제2조(정의)\n" +
                        "   \n" +
                        "① \"회사\"란 (주)제이더블유씨네트웍스 회사가 \"콘텐츠\" 산업과 관련된 경제활동을 영위하는 자로서 콘텐츠 및 제반서비스를 제공하는 자를 말합니다.\n" +
                        "② \"이용자\"란 \"회사\"의 어플에 접속하여 이 약관에 따라 \"회사\"가 제공하는 서비스를 받는 회원 및 비회원을 말합니다.\n" +
                        "③ ‘회원’이라 함은 \"회사\"에 개인정보를 제공하여 회원등록을 한 자로서, \"회사\"의 정보를 지속적으로 제공받으며, \"회사\"가 제공하는 서비스를 계속적으로 이용할 수 있는 자를 말합니다.\n" +
                        "④ ‘비회원’이라 함은 회원에 가입하지 않고 \"회사\"이 제공하는 서비스를 이용하는 자를 말합니다.\n" +
                        " \n" +
                        " \n" +
                        "제3조(약관등의 명시와 설명 및 개정) \n" +
                        "\n" +
                        "① \"회사\"는 이 약관의 내용과 상호 및 대표자 성명, 영업소 소재지 주소(소비자의 불만을 처리할 수 있는 곳의 주소를 포함), 전화번호·모사전송번호·전자우편주소, 사업자등록번호, 통신판매업신고번호, 개인정보관리책임자등을 이용자가 쉽게 알 수 있도록 \"회사\"의 초기 서비스화면(전면)에 게시합니다. 다만, 약관의 내용은 이용자가 연결화면을 통하여 볼 수 있도록 할 수 있습니다.\n" +
                        "② \"회사\"는 이용자가 약관에 동의하기에 앞서 약관에 정하여져 있는 내용 중 청약철회·배송책임·환불조건 등과 같은 중요한 내용을 이용자가 이해할 수 있도록 별도의 연결화면 또는 팝업화면 등을 제공하여 이용자의 확인을 구하여야 합니다.\n" +
                        "③ \"회사\"는 전자상거래등에서의소비자보호에관한법률, 약관의규제에관한법률, 전자거래기본법, 전자서명법, 정보통신망이용촉진등에관한법률, 방문판매등에관한법률, 소비자보호법 등 관련법을 위배하지 않는 범위에서 이 약관을 개정할 수 있습니다.\n" +
                        "④ \"회사\"는 약관을 개정할 경우에는 적용일자 및 개정사유를 명시하여 현행약관과 함께 회사의 초기화면에 그 적용일자 7일이전부터 적용일자 전일까지 공지합니다.\n" +
                        "다만, 이용자에게 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다.  이 경우 \"회사“은 개정전 내용과 개정후 내용을 명확하게 비교하여 이용자가 알기 쉽도록 표시합니다. \n" +
                        "⑤ \"회사\"는 약관을 개정할 경우에는 그 개정약관은 그 적용일자 이후에 체결되는 계약에만 적용되고 그 이전에 이미 체결된 계약에 대해서는 개정전의 약관조항이 그대로 적용됩니다. 다만 이미 계약을 체결한 이용자가 개정약관 조항의 적용을 받기를 원하는 뜻을 제3항에 의한 개정약관의 공지기간내에 \"회사\"에 송신하여 \"회사\"의 동의를 받은 경우에는 개정약관 조항이 적용됩니다.\n" +
                        "⑥ 이 약관에서 정하지 아니한 사항과 이 약관의 해석에 관하여는 전자상거래등에서의 소비자보호에 관한 법률, 약관의 규제 등에 관한 법률, 공정거래위원회가 정하는 전자상거래 등에서의 소비자보호지침 및 관계법령 또는 상관례에 따릅니다.\n" +
                        "\n" +
                        "\n" +
                        "제4조(서비스의 제공 및 변경) \n" +
                        "\n" +
                        "① \"회사\"는 다음과 같은 업무를 수행합니다.\n" +
                        "1. 용역에 대한 정보 제공 및 구매계약의 체결\n" +
                        "2. 구매계약이 체결된 용역의 배송\n" +
                        "3. 기타 \"회사\"가 정하는 업무\n" +
                        "② \"회사\"는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된 용역의 내용 및 제공일자를 명시하여 현재의 용역의 내용을 게시한 곳에 즉시 공지합니다.\n" +
                        "③ \"회사\"가 제공하기로 이용자와 계약을 체결한 서비스의 내용을 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한 주소로 즉시 통지합니다.\n" +
                        "④ 전항의 경우 \"회사\"는 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, \"회사\"가 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.\n" +
                        "\n" +
                        "\n" +
                        "제5조(서비스의 중단) \n" +
                        "\n" +
                        "① \"회사\"는 컴퓨터 등 정보통신설비의 보수점검·교체 및 고장, 통신의 두절 등의 사유가 발생한 경우에는 서비스의 제공을 일시적으로 중단할 수 있습니다.\n" +
                        "② \"회사\"는 제1항의 사유로 서비스의 제공이 일시적으로 중단됨으로 인하여 이용자 또는 제3자가 입은 손해에 대하여 배상합니다. 단, \"회사\"는 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.\n" +
                        "③ 사업종목의 전환, 사업의 포기, 업체간의 통합 등의 이유로 서비스를 제공할 수 없게 되는 경우에는 \"회사\"는 제8조에 정한 방법으로 이용자에게 통지하고 당초 \"회사\"에서 제시한 조건에 따라 소비자에게 보상합니다. 다만, \"회사\"가 보상기준 등을 고지하지 아니한 경우에는 이용자들의 마일리지 또는 적립금 등을 \"회사\"에서 통용되는 통화가치에 상응하는 현물 또는 현금으로 이용자에게 지급합니다.\n" +
                        "\n" +
                        "\n" +
                        "제6조(회원가입) \n" +
                        "\n" +
                        "① 이용자는 \"회사\"가 정한 가입 양식에 따라 회원정보를 기입한 후 이 약관에 동의한다는 의사표시를 함으로서 회원가입을 신청합니다.\n" +
                        "② \"회사\"는 제1항과 같이 회원으로 가입할 것을 신청한 이용자 중 다음 각호에 해당하지 않는 한 회원으로 등록합니다.\n" +
                        "1. 가입신청자가 이 약관 제7조제3항에 의하여 이전에 회원자격을 상실한 적이 있는 경우, 다만 제7조제3항에 의한 회원자격 상실후 3년이 경과한 자로서 \"회사\"의 회원재가입 승낙을 얻은 경우에는 예외로 한다.\n" +
                        "2. 등록 내용에 허위, 기재누락, 오기가 있는 경우\n" +
                        "3. 기타 회원으로 등록하는 것이 \"회사\"의 기술상 현저히 지장이 있다고 판단되는 경우\n" +
                        "③ 회원가입계약의 성립시기는 \"회사\"의 승낙이 회원에게 도달한 시점으로 합니다.\n" +
                        "④ 회원은 제15조제1항에 의한 등록사항에 변경이 있는 경우, 즉시 전자우편 기타 방법으로 \"회사\"에 대하여 그 변경사항을 알려야 합니다.\n" +
                        "\n" +
                        "\n" +
                        "제7조(회원 탈퇴 및 자격 상실 등) \n" +
                        "\n" +
                        "① 회원은 \"회사\"에 언제든지 탈퇴를 요청할 수 있으며 \"회사\"는 즉시 회원탈퇴를 처리합니다.\n" +
                        "② 회원이 다음 각호의 사유에 해당하는 경우, \"회사\"는 회원자격을 제한 및 정지시킬 수 있습니다.\n" +
                        "1. 가입 신청시에 허위 내용을 등록한 경우\n" +
                        "2. 다른 사람의 \"회사\" 이용을 방해하거나 그 정보를 도용하는 등 전자상거래 질서를 위협하는 경우\n" +
                        "3. \"회사\"를 이용하여 법령 또는 이 약관이 금지하거나 공서양속에 반하는 행위를 하는 경우\n" +
                        "③ \"회사\"가 회원 자격을 제한·정지 시킨후, 동일한 행위가 2회이상 반복되거나 30일이내에 그 사유가 시정되지 아니하는 경우 \"회사\"는 회원자격을 상실시킬 수 있습니다.\n" +
                        "④ \"회사\"가 회원자격을 상실시키는 경우에는 회원등록을 말소합니다. 이 경우 회원에게 이를 통지하고, 회원등록 말소전에 최소한 30일 이상의 기간을 정하여 소명할 기회를 부여합니다.\n" +
                        "\n" +
                        "\n" +
                        "제8조(회원에 대한 통지)\n" +
                        "\n" +
                        "① \"회사\"가 회원에 대한 통지를 하는 경우, 회원이 \"회사\"와 미리 약정하여 지정한 전자우편 주소로 할 수 있습니다.\n" +
                        "② \"회사\"는 불특정다수 회원에 대한 통지의 경우 1주일이상 \"회사\" 게시판에 게시함으로서 개별 통지에 갈음할 수 있습니다. 다만, 회원 본인의 거래와 관련하여 중대한 영향을 미치는 사항에 대하여는 개별통지를 합니다.\n" +
                        "\n" +
                        "\n" +
                        "제9조(개인정보보호)\n" +
                        "\n" +
                        "① \"회사\"는 이용자의 정보수집시 구매계약 이행에 필요한 최소한의 정보를 수집합니다. 다음 사항을 필수사항으로 하며 그 외 사항은 선택사항으로 합니다. \n" +
                        "1. 성명\n" +
                        "2. 주소\n" +
                        "3. 전화번호\n" +
                        "4. 희망ID(회원의 경우)\n" +
                        "5. 비밀번호(회원의 경우)\n" +
                        "6. 전자우편주소(또는 이동전화번호)\n" +
                        "② \"회사\"가 이용자의 개인식별이 가능한 개인정보를 수집하는 때에는 반드시 당해 이용자의 동의를 받습니다.\n" +
                        "③ 제공된 개인정보는 당해 이용자의 동의없이 목적외의 이용이나 제3자에게 제공할 수 없으며, 이에 대한 모든 책임은 회사가 집니다.  다만, 다음의 경우에는 예외로 합니다.\n" +
                        "1. 배송업무상 배송업체에게 배송에 필요한 최소한의 이용자의 정보(성명, 주소, 전화번호)를 알려주는 경우\n" +
                        "2. 통계작성, 학술연구 또는 시장조사를 위하여 필요한 경우로서 특정 개인을 식별할 수 없는 형태로 제공하는 경우\n" +
                        "3. 도용방지를 위하여 본인확인에 필요한 경우\n" +
                        "4. 법률의 규정 또는 법률에 의하여 필요한 불가피한 사유가 있는 경우\n" +
                        "④ \"회사\"는 제2항과 제3항에 의해 이용자의 동의를 받아야 하는 경우에는 개인정보관리 책임자의 신원(소속, 성명 및 전화번호, 기타 연락처), 정보의 수집목적 및 이용목적, 제3자에 대한 정보제공 관련사항(제공받은자, 제공목적 및 제공할 정보의 내용) 등 정보통신망이용촉진등에관한법률 제22조제2항이 규정한 사항을 미리 명시하거나 고지해야 하며 이용자는 언제든지 이 동의를 철회할 수 있습니다.\n" +
                        "⑤ 이용자는 언제든지 \"회사\"가 가지고 있는 자신의 개인정보에 대해 열람 및 오류정정을 요구할 수 있으며 \"회사\"는 이에 대해 지체없이 필요한 조치를 취할 의무를 집니다. 이용자가 오류의 정정을 요구한 경우에는 \"회사\"는 그 오류를 정정할 때까지 당해 개인정보를 이용하지 않습니다.\n" +
                        "⑥ \"회사\"는 개인정보 보호를 위하여 관리자를 한정하여 그 수를 최소화하며 신용카드, 은행계좌 등을 포함한 이용자의 개인정보의 분실, 도난, 유출, 변조 등으로 인한 이용자의 손해에 대하여 모든 책임을  집니다.\n" +
                        "⑦ \"회사\" 또는 그로부터 개인정보를 제공받은 제3자는 개인정보의 수집목적 또는 제공받은 목적을 달성한 때에는 당해 개인정보를 지체없이 파기합니다.\n" +
                        "\n" +
                        "\n" +
                        "제10조(“회사“의 의무)\n" +
                        "\n" +
                        "① \"회사\"는 법령과 이 약관이 금지하거나 공서양속에 반하는 행위를 하지 않으며 이 약관이 정하는 바에 따라 지속적이고, 안정적으로용역을 제공하는데 최선을 다하여야 합니다.\n" +
                        "② \"회사\"는 이용자가 안전하게 인터넷 서비스를 이용할 수 있도록 이용자의 개인정보(신용정보 포함)보호를 위한 보안 시스템을 갖추어야 합니다.\n" +
                        "③ \"회사\"는 상품이나 용역에 대하여 「표시·광고의공정화에관한법률」 제3조 소정의 부당한 표시·광고행위를 함으로써 이용자가 손해를 입은 때에는 이를 배상할 책임을 집니다.\n" +
                        "④ \"회사\"는 이용자가 원하지 않는 영리목적의 광고성 전자우편을 발송하지 않습니다.\n" +
                        "\n" +
                        "\n" +
                        "제11조(회원의 ID 및 비밀번호에 대한 의무)\n" +
                        "\n" +
                        "① 제17조의 경우를 제외한 ID와 비밀번호에 관한 관리책임은 회원에게 있습니다.\n" +
                        "② 회원은 자신의 ID 및 비밀번호를 제3자에게 이용하게 해서는 안됩니다.\n" +
                        "③ 회원이 자신의 ID 및 비밀번호를 도난당하거나 제3자가 사용하고 있음을 인지한 경우에는 바로 \"회사\"에 통보하고 \"회사\"의 안내가 있는 경우에는 그에 따라야 합니다.\n" +
                        "\n" +
                        "\n" +
                        "제12조(이용자의 의무) 이용자는 다음 행위를 하여서는 안됩니다.\n" +
                        "1. 신청 또는 변경시 허위 내용의 등록\n" +
                        "2. 타인의 정보 도용\n" +
                        "3. \"회사\"에 게시된 정보의 변경\n" +
                        "4. \"회사\"가 정한 정보 이외의 정보(컴퓨터 프로그램 등) 등의 송신 또는 게시\n" +
                        "5. \"회사\" 기타 제3자의 저작권 등 지적재산권에 대한 침해\n" +
                        "6. \"회사\" 기타 제3자의 명예를 손상시키거나 업무를 방해하는 행위\n" +
                        "7. 외설 또는 폭력적인 메시지, 화상, 음성, 기타 공서양속에 반하는 정보를 회사에 공개 또는 게시하는 행위\n" +
                        "\n" +
                        "\n" +
                        "제13조(연결\"회사\"와 피연결\"회사\" 간의 관계)\n" +
                        "\n" +
                        "① 상위 \"회사\"와 하위 \"회사\"가 하이퍼 링크(예: 하이퍼 링크의 대상에는 문자, 그림 및 동화상 등이 포함됨)방식 등으로 연결된 경우, 전자를 연결 \"회사\"(어플)라고 하고 후자를 피연결 \"회사\"(어플)이라고 합니다.\n" +
                        "② 연결\"회사\"는 피연결\"회사\"의 독자적으로 제공하는 용역등에 의하여 이용자와 행하는 거래에 대해서 보증책임을 지지 않는다는 뜻을 연결\"회사\"의 초기화면 또는 연결되는 시점의 팝업화면으로 명시한 경우에는 그 거래에 대한 보증책임을 지지 않습니다.\n" +
                        "\n" +
                        "\n" +
                        "제14조(저작권의 귀속 및 이용제한)\n" +
                        "\n" +
                        "① “회사“가 작성한 저작물에 대한 저작권 기타 지적재산권은 ”회사“에 귀속합니다.\n" +
                        "② 이용자는 \"회사\"를 이용함으로써 얻은 정보 중 \"회사\"에게 지적재산권이 귀속된 정보를 \"회사\"의 사전 승낙없이 복제, 송신, 출판, 배포, 방송 기타 방법에 의하여 영리목적으로 이용하거나 제3자에게 이용하게 하여서는 안됩니다.\n" +
                        "③ \"회사\"는 약정에 따라 이용자에게 귀속된 저작권을 사용하는 경우 당해 이용자에게 통보하여야 합니다.\n" +
                        "\n" +
                        "\n" +
                        "제15조(분쟁해결)\n" +
                        "\n" +
                        "① \"회사\"는 이용자가 제기하는 정당한 의견이나 불만을 반영하고 그 피해를 보상처리하기 위하여 피해보상처리기구를 설치·운영합니다.\n" +
                        "② \"회사\"는 이용자로부터 제출되는 불만사항 및 의견은 우선적으로 그 사항을 처리합니다. 다만, 신속한 처리가 곤란한 경우에는 이용자에게 그 사유와 처리일정을 즉시 통보해 드립니다.\n" +
                        "③ \"회사\"와 이용자간에 발생한 전자상거래 분쟁과 관련하여 이용자의 피해구제신청이 있는 경우에는 공정거래위원회 또는 시·도지사가 의뢰하는 분쟁조정기관의 조정에 따를 수 있습니다.\n" +
                        "\n" +
                        "\n" +
                        "제16조(재판권 및 준거법)\n" +
                        "\n" +
                        "① \"회사\"와 이용자간에 발생한 전자상거래 분쟁에 관한 소송은 제소 당시의 이용자의 주소에 의하고, 주소가 없는 경우에는 거소를 관할하는 지방법원의 전속관할로 합니다. 다만, 제소 당시 이용자의 주소 또는 거소가 분명하지 않거나 외국 거주자의 경우에는 민사소송법상의 관할법원에 제기합니다.\n" +
                        "② \"회사\"와 이용자간에 제기된 전자상거래 소송에는 한국법을 적용합니다.\n" +
                        "\n" +
                        "\n" +
                        "부칙 \n" +
                        "\n" +
                        "1. 이 약관은 2018년 01월 01일부터 적용됩니다.\n");

    }
}
