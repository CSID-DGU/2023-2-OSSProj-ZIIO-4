import React from 'react';
import { AiOutlineClose } from 'react-icons/ai';
import styles from './ClipModal.module.scss';
import instance from "../../api/instance";
import { addScraps } from "../../api/userAPI";

const fetchProjects = async planData => {
  const { data } = await instance.post('/scraps', planData);
  return data;
};

const ClipModal = ({ noticeId, categoryId, onModalClose, openEventModal, onReloadScraps }) => {

  const handleClose = () => {
    onModalClose(false);
  };

  const saveClip = async () => {
    const resultData = {
      notice_id: noticeId,
      category_id: categoryId
    }
    const SearchData = addScraps(resultData);
    if (SearchData) { onReloadScraps(); onModalClose(false); }
  };

  return (
    <div className={styles.modalBackgound}>
      <div className={styles.modalContainer}>
        <div className={styles.modalHeader}>
          <div className={styles.item}>일정 등록 여부 확인</div>
          <AiOutlineClose className={styles.button} onClick={handleClose} />
        </div>
        <div className={styles.modalButtonContainer}>
          <button className={styles.button} onClick={saveClip}>
            스크랩만 하기
          </button>
          <button className={styles.button} onClick={openEventModal}>
            일정 등록
          </button>
        </div>
      </div>
    </div>
  );
};

export default ClipModal;
