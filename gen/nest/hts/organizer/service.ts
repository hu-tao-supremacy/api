/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  UserEvent_Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
  Location,
  User,
  UserOrganization,
  EventDuration,
  EventTag,
  Answer,
  UserEvent,
  userEvent_StatusFromJSON,
  userEvent_StatusToJSON,
  GetObjectByIdRequest,
  GetObjectByNameRequest,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { BoolValue } from "../../google/protobuf/wrappers";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.organizer";

export interface Duration {
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
}

export interface CreateOrganizationRequest {
  userId: number;
  organization: Organization | undefined;
}

export interface UpdateOrganizationRequest {
  userId: number;
  organization: Organization | undefined;
}

export interface RemoveOrganizationRequest {
  userId: number;
  organizationId: number;
}

export interface UpdateUsersInOrganizationRequest {
  userId: number;
  userIds: number[];
  organizationId: number;
}

export interface CreateEventRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventDurationRequest {
  userId: number;
  eventId: number;
  duration: Duration[];
}

export interface RemoveEventRequest {
  userId: number;
  eventId: number;
}

export interface UpdateRegistrationRequestRequest {
  userId: number;
  registeredUserId: number;
  registeredEventId: number;
  status: UserEvent_Status;
}

export interface CreateTagRequest {
  userId: number;
  organizationId: number;
  tag: Tag | undefined;
}

export interface UpdateTagRequest {
  userId: number;
  tagIds: number[];
  eventId: number;
}

export interface HasEventRequest {
  organizationId: number;
  eventId: number;
}

export interface AddQuestionGroupsRequest {
  userId: number;
  questionGroups: QuestionGroup[];
}

export interface RemoveQuestionGroupsRequest {
  userId: number;
  questionGroupIds: number[];
}

export interface AddQuestionsRequest {
  userId: number;
  questions: Question[];
}

export interface RemoveQuestionsRequest {
  userId: number;
  questionIds: number[];
}

export interface CreateLocationRequest {
  userId: number;
  location: Location | undefined;
}

export interface UpdateLocationRequest {
  userId: number;
  location: Location | undefined;
}

export interface RemoveLocationRequest {
  userId: number;
  locationId: number;
}

export interface GenerateTicketRequest {
  userId: number;
  eventId: number;
}

export interface OrganizationListResponse {
  organizations: Organization[];
}

export interface UserListResponse {
  users: User[];
}

export interface UserOrganizationListResponse {
  userOrganizations: UserOrganization[];
}

export interface EventDurationListResponse {
  eventDurations: EventDuration[];
}

export interface EventTagListResponse {
  eventTags: EventTag[];
}

export interface QuestionGroupListResponse {
  questionGroups: QuestionGroup[];
}

export interface QuestionListResponse {
  questions: Question[];
}

export interface AnswerListResponse {
  answers: Answer[];
}

export interface LocationListResponse {
  locations: Location[];
}

export interface CheckInRequest {
  userId: number;
  eventId: number;
}

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

const baseDuration: object = {};

export const Duration = {
  fromJSON(object: any): Duration {
    const message = { ...baseDuration } as Duration;
    if (object.start !== undefined && object.start !== null) {
      message.start = fromJsonTimestamp(object.start);
    } else {
      message.start = undefined;
    }
    if (object.finish !== undefined && object.finish !== null) {
      message.finish = fromJsonTimestamp(object.finish);
    } else {
      message.finish = undefined;
    }
    return message;
  },

  toJSON(message: Duration): unknown {
    const obj: any = {};
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined
          ? fromTimestamp(message.start).toISOString()
          : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined
          ? fromTimestamp(message.finish).toISOString()
          : null);
    return obj;
  },
};

const baseCreateOrganizationRequest: object = { userId: 0 };

export const CreateOrganizationRequest = {
  fromJSON(object: any): CreateOrganizationRequest {
    const message = {
      ...baseCreateOrganizationRequest,
    } as CreateOrganizationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromJSON(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },

  toJSON(message: CreateOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organization !== undefined &&
      (obj.organization = message.organization
        ? Organization.toJSON(message.organization)
        : undefined);
    return obj;
  },
};

const baseUpdateOrganizationRequest: object = { userId: 0 };

export const UpdateOrganizationRequest = {
  fromJSON(object: any): UpdateOrganizationRequest {
    const message = {
      ...baseUpdateOrganizationRequest,
    } as UpdateOrganizationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromJSON(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },

  toJSON(message: UpdateOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organization !== undefined &&
      (obj.organization = message.organization
        ? Organization.toJSON(message.organization)
        : undefined);
    return obj;
  },
};

const baseRemoveOrganizationRequest: object = { userId: 0, organizationId: 0 };

export const RemoveOrganizationRequest = {
  fromJSON(object: any): RemoveOrganizationRequest {
    const message = {
      ...baseRemoveOrganizationRequest,
    } as RemoveOrganizationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    return message;
  },

  toJSON(message: RemoveOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    return obj;
  },
};

const baseUpdateUsersInOrganizationRequest: object = {
  userId: 0,
  userIds: 0,
  organizationId: 0,
};

export const UpdateUsersInOrganizationRequest = {
  fromJSON(object: any): UpdateUsersInOrganizationRequest {
    const message = {
      ...baseUpdateUsersInOrganizationRequest,
    } as UpdateUsersInOrganizationRequest;
    message.userIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.userIds !== undefined && object.userIds !== null) {
      for (const e of object.userIds) {
        message.userIds.push(Number(e));
      }
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    return message;
  },

  toJSON(message: UpdateUsersInOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.userIds) {
      obj.userIds = message.userIds.map((e) => e);
    } else {
      obj.userIds = [];
    }
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    return obj;
  },
};

const baseCreateEventRequest: object = { userId: 0 };

export const CreateEventRequest = {
  fromJSON(object: any): CreateEventRequest {
    const message = { ...baseCreateEventRequest } as CreateEventRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromJSON(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },

  toJSON(message: CreateEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    return obj;
  },
};

const baseUpdateEventRequest: object = { userId: 0 };

export const UpdateEventRequest = {
  fromJSON(object: any): UpdateEventRequest {
    const message = { ...baseUpdateEventRequest } as UpdateEventRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromJSON(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },

  toJSON(message: UpdateEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    return obj;
  },
};

const baseUpdateEventDurationRequest: object = { userId: 0, eventId: 0 };

export const UpdateEventDurationRequest = {
  fromJSON(object: any): UpdateEventDurationRequest {
    const message = {
      ...baseUpdateEventDurationRequest,
    } as UpdateEventDurationRequest;
    message.duration = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.duration !== undefined && object.duration !== null) {
      for (const e of object.duration) {
        message.duration.push(Duration.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: UpdateEventDurationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    if (message.duration) {
      obj.duration = message.duration.map((e) =>
        e ? Duration.toJSON(e) : undefined
      );
    } else {
      obj.duration = [];
    }
    return obj;
  },
};

const baseRemoveEventRequest: object = { userId: 0, eventId: 0 };

export const RemoveEventRequest = {
  fromJSON(object: any): RemoveEventRequest {
    const message = { ...baseRemoveEventRequest } as RemoveEventRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: RemoveEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },
};

const baseUpdateRegistrationRequestRequest: object = {
  userId: 0,
  registeredUserId: 0,
  registeredEventId: 0,
  status: 0,
};

export const UpdateRegistrationRequestRequest = {
  fromJSON(object: any): UpdateRegistrationRequestRequest {
    const message = {
      ...baseUpdateRegistrationRequestRequest,
    } as UpdateRegistrationRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (
      object.registeredUserId !== undefined &&
      object.registeredUserId !== null
    ) {
      message.registeredUserId = Number(object.registeredUserId);
    } else {
      message.registeredUserId = 0;
    }
    if (
      object.registeredEventId !== undefined &&
      object.registeredEventId !== null
    ) {
      message.registeredEventId = Number(object.registeredEventId);
    } else {
      message.registeredEventId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = userEvent_StatusFromJSON(object.status);
    } else {
      message.status = 0;
    }
    return message;
  },

  toJSON(message: UpdateRegistrationRequestRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.registeredUserId !== undefined &&
      (obj.registeredUserId = message.registeredUserId);
    message.registeredEventId !== undefined &&
      (obj.registeredEventId = message.registeredEventId);
    message.status !== undefined &&
      (obj.status = userEvent_StatusToJSON(message.status));
    return obj;
  },
};

const baseCreateTagRequest: object = { userId: 0, organizationId: 0 };

export const CreateTagRequest = {
  fromJSON(object: any): CreateTagRequest {
    const message = { ...baseCreateTagRequest } as CreateTagRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    if (object.tag !== undefined && object.tag !== null) {
      message.tag = Tag.fromJSON(object.tag);
    } else {
      message.tag = undefined;
    }
    return message;
  },

  toJSON(message: CreateTagRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.tag !== undefined &&
      (obj.tag = message.tag ? Tag.toJSON(message.tag) : undefined);
    return obj;
  },
};

const baseUpdateTagRequest: object = { userId: 0, tagIds: 0, eventId: 0 };

export const UpdateTagRequest = {
  fromJSON(object: any): UpdateTagRequest {
    const message = { ...baseUpdateTagRequest } as UpdateTagRequest;
    message.tagIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.tagIds !== undefined && object.tagIds !== null) {
      for (const e of object.tagIds) {
        message.tagIds.push(Number(e));
      }
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: UpdateTagRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.tagIds) {
      obj.tagIds = message.tagIds.map((e) => e);
    } else {
      obj.tagIds = [];
    }
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },
};

const baseHasEventRequest: object = { organizationId: 0, eventId: 0 };

export const HasEventRequest = {
  fromJSON(object: any): HasEventRequest {
    const message = { ...baseHasEventRequest } as HasEventRequest;
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: HasEventRequest): unknown {
    const obj: any = {};
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },
};

const baseAddQuestionGroupsRequest: object = { userId: 0 };

export const AddQuestionGroupsRequest = {
  fromJSON(object: any): AddQuestionGroupsRequest {
    const message = {
      ...baseAddQuestionGroupsRequest,
    } as AddQuestionGroupsRequest;
    message.questionGroups = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: AddQuestionGroupsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questionGroups) {
      obj.questionGroups = message.questionGroups.map((e) =>
        e ? QuestionGroup.toJSON(e) : undefined
      );
    } else {
      obj.questionGroups = [];
    }
    return obj;
  },
};

const baseRemoveQuestionGroupsRequest: object = {
  userId: 0,
  questionGroupIds: 0,
};

export const RemoveQuestionGroupsRequest = {
  fromJSON(object: any): RemoveQuestionGroupsRequest {
    const message = {
      ...baseRemoveQuestionGroupsRequest,
    } as RemoveQuestionGroupsRequest;
    message.questionGroupIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (
      object.questionGroupIds !== undefined &&
      object.questionGroupIds !== null
    ) {
      for (const e of object.questionGroupIds) {
        message.questionGroupIds.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: RemoveQuestionGroupsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questionGroupIds) {
      obj.questionGroupIds = message.questionGroupIds.map((e) => e);
    } else {
      obj.questionGroupIds = [];
    }
    return obj;
  },
};

const baseAddQuestionsRequest: object = { userId: 0 };

export const AddQuestionsRequest = {
  fromJSON(object: any): AddQuestionsRequest {
    const message = { ...baseAddQuestionsRequest } as AddQuestionsRequest;
    message.questions = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: AddQuestionsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questions) {
      obj.questions = message.questions.map((e) =>
        e ? Question.toJSON(e) : undefined
      );
    } else {
      obj.questions = [];
    }
    return obj;
  },
};

const baseRemoveQuestionsRequest: object = { userId: 0, questionIds: 0 };

export const RemoveQuestionsRequest = {
  fromJSON(object: any): RemoveQuestionsRequest {
    const message = { ...baseRemoveQuestionsRequest } as RemoveQuestionsRequest;
    message.questionIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.questionIds !== undefined && object.questionIds !== null) {
      for (const e of object.questionIds) {
        message.questionIds.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: RemoveQuestionsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questionIds) {
      obj.questionIds = message.questionIds.map((e) => e);
    } else {
      obj.questionIds = [];
    }
    return obj;
  },
};

const baseCreateLocationRequest: object = { userId: 0 };

export const CreateLocationRequest = {
  fromJSON(object: any): CreateLocationRequest {
    const message = { ...baseCreateLocationRequest } as CreateLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.location !== undefined && object.location !== null) {
      message.location = Location.fromJSON(object.location);
    } else {
      message.location = undefined;
    }
    return message;
  },

  toJSON(message: CreateLocationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.location !== undefined &&
      (obj.location = message.location
        ? Location.toJSON(message.location)
        : undefined);
    return obj;
  },
};

const baseUpdateLocationRequest: object = { userId: 0 };

export const UpdateLocationRequest = {
  fromJSON(object: any): UpdateLocationRequest {
    const message = { ...baseUpdateLocationRequest } as UpdateLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.location !== undefined && object.location !== null) {
      message.location = Location.fromJSON(object.location);
    } else {
      message.location = undefined;
    }
    return message;
  },

  toJSON(message: UpdateLocationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.location !== undefined &&
      (obj.location = message.location
        ? Location.toJSON(message.location)
        : undefined);
    return obj;
  },
};

const baseRemoveLocationRequest: object = { userId: 0, locationId: 0 };

export const RemoveLocationRequest = {
  fromJSON(object: any): RemoveLocationRequest {
    const message = { ...baseRemoveLocationRequest } as RemoveLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.locationId !== undefined && object.locationId !== null) {
      message.locationId = Number(object.locationId);
    } else {
      message.locationId = 0;
    }
    return message;
  },

  toJSON(message: RemoveLocationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.locationId !== undefined && (obj.locationId = message.locationId);
    return obj;
  },
};

const baseGenerateTicketRequest: object = { userId: 0, eventId: 0 };

export const GenerateTicketRequest = {
  fromJSON(object: any): GenerateTicketRequest {
    const message = { ...baseGenerateTicketRequest } as GenerateTicketRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: GenerateTicketRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },
};

const baseOrganizationListResponse: object = {};

export const OrganizationListResponse = {
  fromJSON(object: any): OrganizationListResponse {
    const message = {
      ...baseOrganizationListResponse,
    } as OrganizationListResponse;
    message.organizations = [];
    if (object.organizations !== undefined && object.organizations !== null) {
      for (const e of object.organizations) {
        message.organizations.push(Organization.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: OrganizationListResponse): unknown {
    const obj: any = {};
    if (message.organizations) {
      obj.organizations = message.organizations.map((e) =>
        e ? Organization.toJSON(e) : undefined
      );
    } else {
      obj.organizations = [];
    }
    return obj;
  },
};

const baseUserListResponse: object = {};

export const UserListResponse = {
  fromJSON(object: any): UserListResponse {
    const message = { ...baseUserListResponse } as UserListResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: UserListResponse): unknown {
    const obj: any = {};
    if (message.users) {
      obj.users = message.users.map((e) => (e ? User.toJSON(e) : undefined));
    } else {
      obj.users = [];
    }
    return obj;
  },
};

const baseUserOrganizationListResponse: object = {};

export const UserOrganizationListResponse = {
  fromJSON(object: any): UserOrganizationListResponse {
    const message = {
      ...baseUserOrganizationListResponse,
    } as UserOrganizationListResponse;
    message.userOrganizations = [];
    if (
      object.userOrganizations !== undefined &&
      object.userOrganizations !== null
    ) {
      for (const e of object.userOrganizations) {
        message.userOrganizations.push(UserOrganization.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: UserOrganizationListResponse): unknown {
    const obj: any = {};
    if (message.userOrganizations) {
      obj.userOrganizations = message.userOrganizations.map((e) =>
        e ? UserOrganization.toJSON(e) : undefined
      );
    } else {
      obj.userOrganizations = [];
    }
    return obj;
  },
};

const baseEventDurationListResponse: object = {};

export const EventDurationListResponse = {
  fromJSON(object: any): EventDurationListResponse {
    const message = {
      ...baseEventDurationListResponse,
    } as EventDurationListResponse;
    message.eventDurations = [];
    if (object.eventDurations !== undefined && object.eventDurations !== null) {
      for (const e of object.eventDurations) {
        message.eventDurations.push(EventDuration.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: EventDurationListResponse): unknown {
    const obj: any = {};
    if (message.eventDurations) {
      obj.eventDurations = message.eventDurations.map((e) =>
        e ? EventDuration.toJSON(e) : undefined
      );
    } else {
      obj.eventDurations = [];
    }
    return obj;
  },
};

const baseEventTagListResponse: object = {};

export const EventTagListResponse = {
  fromJSON(object: any): EventTagListResponse {
    const message = { ...baseEventTagListResponse } as EventTagListResponse;
    message.eventTags = [];
    if (object.eventTags !== undefined && object.eventTags !== null) {
      for (const e of object.eventTags) {
        message.eventTags.push(EventTag.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: EventTagListResponse): unknown {
    const obj: any = {};
    if (message.eventTags) {
      obj.eventTags = message.eventTags.map((e) =>
        e ? EventTag.toJSON(e) : undefined
      );
    } else {
      obj.eventTags = [];
    }
    return obj;
  },
};

const baseQuestionGroupListResponse: object = {};

export const QuestionGroupListResponse = {
  fromJSON(object: any): QuestionGroupListResponse {
    const message = {
      ...baseQuestionGroupListResponse,
    } as QuestionGroupListResponse;
    message.questionGroups = [];
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: QuestionGroupListResponse): unknown {
    const obj: any = {};
    if (message.questionGroups) {
      obj.questionGroups = message.questionGroups.map((e) =>
        e ? QuestionGroup.toJSON(e) : undefined
      );
    } else {
      obj.questionGroups = [];
    }
    return obj;
  },
};

const baseQuestionListResponse: object = {};

export const QuestionListResponse = {
  fromJSON(object: any): QuestionListResponse {
    const message = { ...baseQuestionListResponse } as QuestionListResponse;
    message.questions = [];
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: QuestionListResponse): unknown {
    const obj: any = {};
    if (message.questions) {
      obj.questions = message.questions.map((e) =>
        e ? Question.toJSON(e) : undefined
      );
    } else {
      obj.questions = [];
    }
    return obj;
  },
};

const baseAnswerListResponse: object = {};

export const AnswerListResponse = {
  fromJSON(object: any): AnswerListResponse {
    const message = { ...baseAnswerListResponse } as AnswerListResponse;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(Answer.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: AnswerListResponse): unknown {
    const obj: any = {};
    if (message.answers) {
      obj.answers = message.answers.map((e) =>
        e ? Answer.toJSON(e) : undefined
      );
    } else {
      obj.answers = [];
    }
    return obj;
  },
};

const baseLocationListResponse: object = {};

export const LocationListResponse = {
  fromJSON(object: any): LocationListResponse {
    const message = { ...baseLocationListResponse } as LocationListResponse;
    message.locations = [];
    if (object.locations !== undefined && object.locations !== null) {
      for (const e of object.locations) {
        message.locations.push(Location.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: LocationListResponse): unknown {
    const obj: any = {};
    if (message.locations) {
      obj.locations = message.locations.map((e) =>
        e ? Location.toJSON(e) : undefined
      );
    } else {
      obj.locations = [];
    }
    return obj;
  },
};

const baseCheckInRequest: object = { userId: 0, eventId: 0 };

export const CheckInRequest = {
  fromJSON(object: any): CheckInRequest {
    const message = { ...baseCheckInRequest } as CheckInRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: CheckInRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },
};

export interface OrganizerServiceClient {
  createOrganization(
    request: CreateOrganizationRequest
  ): Observable<Organization>;

  getOrganizations(request: Empty): Observable<OrganizationListResponse>;

  getOrganizationById(request: GetObjectByIdRequest): Observable<Organization>;

  getUsersInOrganizationById(
    request: GetObjectByIdRequest
  ): Observable<UserListResponse>;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Observable<Organization>;

  removeOrganization(
    request: RemoveOrganizationRequest
  ): Observable<Organization>;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<UserOrganizationListResponse>;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<UserOrganizationListResponse>;

  createEvent(request: CreateEventRequest): Observable<Event>;

  updateEvent(request: UpdateEventRequest): Observable<Event>;

  updateEventDurations(
    request: UpdateEventDurationRequest
  ): Observable<EventDurationListResponse>;

  removeEvent(request: RemoveEventRequest): Observable<Event>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Observable<UserEvent>;

  createTag(request: CreateTagRequest): Observable<Tag>;

  addTags(request: UpdateTagRequest): Observable<EventTagListResponse>;

  removeTags(request: UpdateTagRequest): Observable<EventTagListResponse>;

  hasEvent(request: HasEventRequest): Observable<Event>;

  addQuestionGroups(
    request: AddQuestionGroupsRequest
  ): Observable<QuestionGroupListResponse>;

  removeQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ): Observable<QuestionGroupListResponse>;

  addQuestions(request: AddQuestionsRequest): Observable<QuestionListResponse>;

  removeQuestions(
    request: RemoveQuestionsRequest
  ): Observable<QuestionListResponse>;

  getAnswersByQuestionId(
    request: GetObjectByIdRequest
  ): Observable<AnswerListResponse>;

  createLocation(request: CreateLocationRequest): Observable<Location>;

  getLocations(request: Empty): Observable<LocationListResponse>;

  getLocationById(request: GetObjectByIdRequest): Observable<Location>;

  searchLocationsByName(
    request: GetObjectByNameRequest
  ): Observable<LocationListResponse>;

  updateLocation(request: UpdateLocationRequest): Observable<Location>;

  removeLocation(request: RemoveLocationRequest): Observable<Location>;

  generateTicket(request: GenerateTicketRequest): Observable<UserEvent>;

  checkIn(request: CheckInRequest): Observable<UserEvent>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface OrganizerServiceController {
  createOrganization(
    request: CreateOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  getOrganizations(
    request: Empty
  ):
    | Promise<OrganizationListResponse>
    | Observable<OrganizationListResponse>
    | OrganizationListResponse;

  getOrganizationById(
    request: GetObjectByIdRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  getUsersInOrganizationById(
    request: GetObjectByIdRequest
  ):
    | Promise<UserListResponse>
    | Observable<UserListResponse>
    | UserListResponse;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  removeOrganization(
    request: RemoveOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ):
    | Promise<UserOrganizationListResponse>
    | Observable<UserOrganizationListResponse>
    | UserOrganizationListResponse;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ):
    | Promise<UserOrganizationListResponse>
    | Observable<UserOrganizationListResponse>
    | UserOrganizationListResponse;

  createEvent(
    request: CreateEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateEvent(
    request: UpdateEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateEventDurations(
    request: UpdateEventDurationRequest
  ):
    | Promise<EventDurationListResponse>
    | Observable<EventDurationListResponse>
    | EventDurationListResponse;

  removeEvent(
    request: RemoveEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  createTag(request: CreateTagRequest): Promise<Tag> | Observable<Tag> | Tag;

  addTags(
    request: UpdateTagRequest
  ):
    | Promise<EventTagListResponse>
    | Observable<EventTagListResponse>
    | EventTagListResponse;

  removeTags(
    request: UpdateTagRequest
  ):
    | Promise<EventTagListResponse>
    | Observable<EventTagListResponse>
    | EventTagListResponse;

  hasEvent(
    request: HasEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  addQuestionGroups(
    request: AddQuestionGroupsRequest
  ):
    | Promise<QuestionGroupListResponse>
    | Observable<QuestionGroupListResponse>
    | QuestionGroupListResponse;

  removeQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ):
    | Promise<QuestionGroupListResponse>
    | Observable<QuestionGroupListResponse>
    | QuestionGroupListResponse;

  addQuestions(
    request: AddQuestionsRequest
  ):
    | Promise<QuestionListResponse>
    | Observable<QuestionListResponse>
    | QuestionListResponse;

  removeQuestions(
    request: RemoveQuestionsRequest
  ):
    | Promise<QuestionListResponse>
    | Observable<QuestionListResponse>
    | QuestionListResponse;

  getAnswersByQuestionId(
    request: GetObjectByIdRequest
  ):
    | Promise<AnswerListResponse>
    | Observable<AnswerListResponse>
    | AnswerListResponse;

  createLocation(
    request: CreateLocationRequest
  ): Promise<Location> | Observable<Location> | Location;

  getLocations(
    request: Empty
  ):
    | Promise<LocationListResponse>
    | Observable<LocationListResponse>
    | LocationListResponse;

  getLocationById(
    request: GetObjectByIdRequest
  ): Promise<Location> | Observable<Location> | Location;

  searchLocationsByName(
    request: GetObjectByNameRequest
  ):
    | Promise<LocationListResponse>
    | Observable<LocationListResponse>
    | LocationListResponse;

  updateLocation(
    request: UpdateLocationRequest
  ): Promise<Location> | Observable<Location> | Location;

  removeLocation(
    request: RemoveLocationRequest
  ): Promise<Location> | Observable<Location> | Location;

  generateTicket(
    request: GenerateTicketRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  checkIn(
    request: CheckInRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function OrganizerServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "createOrganization",
      "getOrganizations",
      "getOrganizationById",
      "getUsersInOrganizationById",
      "updateOrganization",
      "removeOrganization",
      "addUsersToOrganization",
      "removeUsersFromOrganization",
      "createEvent",
      "updateEvent",
      "updateEventDurations",
      "removeEvent",
      "updateRegistrationRequest",
      "createTag",
      "addTags",
      "removeTags",
      "hasEvent",
      "addQuestionGroups",
      "removeQuestionGroups",
      "addQuestions",
      "removeQuestions",
      "getAnswersByQuestionId",
      "createLocation",
      "getLocations",
      "getLocationById",
      "searchLocationsByName",
      "updateLocation",
      "removeLocation",
      "generateTicket",
      "checkIn",
      "ping",
    ];
    for (const method of grpcMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcMethod("OrganizerService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
    const grpcStreamMethods: string[] = [];
    for (const method of grpcStreamMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcStreamMethod("OrganizerService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
  };
}

export const ORGANIZER_SERVICE_NAME = "OrganizerService";

function toTimestamp(date: Date): Timestamp {
  const seconds = date.getTime() / 1_000;
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): Date {
  let millis = t.seconds * 1_000;
  millis += t.nanos / 1_000_000;
  return new Date(millis);
}

function fromJsonTimestamp(o: any): Timestamp {
  if (o instanceof Date) {
    return toTimestamp(o);
  } else if (typeof o === "string") {
    return toTimestamp(new Date(o));
  } else {
    return Timestamp.fromJSON(o);
  }
}
