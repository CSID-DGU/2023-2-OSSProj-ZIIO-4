import React from 'react';
import styles from '../SchoolCalendar.module.scss';
import classNames from 'classnames';
import { formatDate } from '../../../utils/dateUtils';
import { AiOutlinePlus } from "react-icons/ai";

const EventDetail = ({ eventTitle, eventDateStart, eventDateEnd, eventMemo, eventUrl, eventColor, onOpen }) => {
  return (
    <div className={classNames(styles.eventWrapper, eventTitle === '' && styles.invisible)}>
      <div className={styles.titleWrapper}>
        <div className={styles.eventColor} style={{ backgroundColor: eventColor }} />
        <div className={styles.title}>{eventTitle}</div>
      </div>
      <div className={styles.row}>
        <div className={styles.subtitleWrapper}>
          <div className={styles.subtitle}>기간</div>
        </div>
        <div className={styles.content}>
          {eventDateStart === '' && eventDateEnd === '' ? (
            '없음'
          ) : (
            <>
              {formatDate(eventDateStart)} ~ {eventDateEnd ? formatDate(eventDateEnd) : formatDate(eventDateStart)}
            </>
          )}
        </div>
      </div>
      <button className={styles.button} onClick={() => onOpen()}>
        <AiOutlinePlus className={styles.plusIcon} />
        내 일정 추가
      </button>
    </div>
  );
};

export default EventDetail;