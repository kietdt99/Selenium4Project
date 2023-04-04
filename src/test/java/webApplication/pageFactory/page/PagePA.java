package webApplication.pageFactory.page;

import java.util.Objects;

public interface PagePA extends PagePO {
    default boolean verifyPopupTitle() {
        return Objects.equals(lblPopupTitle.toString(), TEXT_POPUP);
    }
}
